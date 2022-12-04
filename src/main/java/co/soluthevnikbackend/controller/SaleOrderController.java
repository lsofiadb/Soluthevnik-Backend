package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.RawMaterialOrder;
import co.soluthevnikbackend.model.RawMaterialOrderItem;
import co.soluthevnikbackend.model.SaleOrder;
import co.soluthevnikbackend.model.SaleOrderItem;
import co.soluthevnikbackend.model.pk.composed.RawMaterialOrderItemPK;
import co.soluthevnikbackend.model.pk.composed.SaleOrderItemPK;
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
@RequestMapping("/sale_order")
public class SaleOrderController {

    @Autowired
    private SaleOrderService saleOrderService;

    @Autowired
    private SaleOrderItemService saleOrderItemService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public SaleOrder save(@RequestBody String data){
        System.out.println("DATA");
        System.out.println(data);
        JSONObject jsonObject = new JSONObject(data);

        JSONObject sale_order_json = jsonObject.getJSONObject("sale_order");
        System.out.println("sale order");
        System.out.println(sale_order_json);

        //Order
        SaleOrder saleOrder = new SaleOrder();
        saleOrder.setK_id(sale_order_json.getLong("k_id"));
        saleOrder.setClient(clientService.findById(sale_order_json.getLong("client_id")));
        saleOrder.setAdmin(adminService.findById(sale_order_json.getLong("admin_id")));
        Date d_date = new Date();
        saleOrder.setD_date(d_date);
        saleOrder.setTotal_price(sale_order_json.getDouble("total_price"));
        //saving order...
        saleOrderService.save(saleOrder);

        System.out.println(saleOrder);

        //Order items...
        JSONArray items = jsonObject.getJSONArray("sale_order_items");
        System.out.println(items);

        List<SaleOrderItem> orderItems =  new ArrayList<>();

        for(int i = 0; i< items.length(); i++){
            Long product_id = items.getJSONObject(i).getLong("product_id");
            Long q_quantity = items.getJSONObject(i).getLong("q_quantity");
            Double v_unit_price = items.getJSONObject(i).getDouble("v_unit_price");
            //saving item order...
            System.out.println(i);
            orderItems.add(new SaleOrderItem(new SaleOrderItemPK(productService.findById(product_id), saleOrder),q_quantity,v_unit_price));
        }

        for(int i=0; i< orderItems.size(); i++){
            System.out.println("orderItems"+i);
            System.out.println(orderItems.get(i));
            saleOrderItemService.save(orderItems.get(i));
        }

        return saleOrder;
    }

    @GetMapping("/findAll")
    public List<SaleOrder> findAll(){
        return saleOrderService.getAll();
    }
}
