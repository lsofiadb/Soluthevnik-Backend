package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.RawMaterialOrder;
import co.soluthevnikbackend.model.RawMaterialOrderItem;
import co.soluthevnikbackend.model.SaleOrder;
import co.soluthevnikbackend.model.pk.composed.RawMaterialOrderItemPK;
import co.soluthevnikbackend.service.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/raw_material_order")
public class RawMaterialOrderController {

    @Autowired
    private RawMaterialOrderService rawMaterialOrderService;

    @Autowired
    private RawMaterialOrderItemService rawMaterialOrderItemService;

    @Autowired
    private RawMaterialService rawMaterialService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/save")
    public ResponseEntity<RawMaterialOrder> save(@RequestBody String data){
        System.out.println("DATA");
        System.out.println(data);
        JSONObject jsonObject = new JSONObject(data);


        JSONObject raw_material_order_json = jsonObject.getJSONObject("raw_material_order");
        System.out.println("raw material order");
        System.out.println(raw_material_order_json);

        //Order
        RawMaterialOrder rawMaterialOrder = new RawMaterialOrder();
        rawMaterialOrder.setK_id(raw_material_order_json.getLong("k_id"));
        rawMaterialOrder.setSupplier(supplierService.findById(raw_material_order_json.getLong("supplier_id")));
        rawMaterialOrder.setAdmin(adminService.findById(raw_material_order_json.getLong("admin_id")));
        Date d_date = new Date();
        rawMaterialOrder.setD_date(d_date);
        rawMaterialOrder.setV_total_price(raw_material_order_json.getDouble("v_total_price"));
        //saving order...
        rawMaterialOrderService.save(rawMaterialOrder);

        System.out.println(rawMaterialOrder);

        //Order items...
        JSONArray items = jsonObject.getJSONArray("raw_material_order_items");
        System.out.println(items);

        List<RawMaterialOrderItem>  orderItems =  new ArrayList<>();

        for(int i = 0; i< items.length(); i++){
            Long raw_material_id = items.getJSONObject(i).getLong("raw_material_id");
            Long q_quantity = items.getJSONObject(i).getLong("q_quantity");
            Double v_unit_price = items.getJSONObject(i).getDouble("v_unit_price");
            //saving item order...
            System.out.println(i);
            orderItems.add(new RawMaterialOrderItem(new RawMaterialOrderItemPK(rawMaterialOrder,rawMaterialService.findById(raw_material_id)),q_quantity,v_unit_price));
        }

        for(int i=0; i< orderItems.size(); i++){
            System.out.println("orderItems"+i);
            System.out.println(orderItems.get(i));
            rawMaterialOrderItemService.save(orderItems.get(i));
        }

        return ResponseEntity.ok(rawMaterialOrder);
    }

    @GetMapping("/findAll")
    public List<RawMaterialOrder> findAll(){
        return rawMaterialOrderService.getAll();
    }

}
