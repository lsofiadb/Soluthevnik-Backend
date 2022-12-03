package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.dto.RawMaterialItemDTO;
import co.soluthevnikbackend.model.RawMaterialOrderItem;
import co.soluthevnikbackend.model.pk.composed.RawMaterialOrderItemPK;
import co.soluthevnikbackend.service.RawMaterialOrderItemService;
import co.soluthevnikbackend.service.RawMaterialOrderService;
import co.soluthevnikbackend.service.RawMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/raw_material_order_item")
public class RawMaterialOrderItemController {

    @Autowired
    private RawMaterialOrderItemService rawMaterialOrderItemService;

    @Autowired
    private RawMaterialOrderService rawMaterialOrderService;

    @Autowired
    private RawMaterialService rawMaterialService;

    @PostMapping("/save")
    public RawMaterialOrderItem save(@RequestBody RawMaterialItemDTO rawMaterialItemDTO){
        RawMaterialOrderItem rawMaterialOrderItem = new RawMaterialOrderItem();
        rawMaterialOrderItem = rawMaterialItemDTO.getRawMaterialOrderItem(rawMaterialItemDTO);
        RawMaterialOrderItemPK rawMaterialOrderItemPK = new RawMaterialOrderItemPK();
        rawMaterialOrderItemPK.setRawMaterialOrder(rawMaterialOrderService.findById(rawMaterialItemDTO.getRaw_material_order_id()));
        rawMaterialOrderItemPK.setRawMaterial(rawMaterialService.findById(rawMaterialItemDTO.getRaw_material_id()));
        rawMaterialOrderItem.setRawMaterialOrderItemPK(rawMaterialOrderItemPK);
        return rawMaterialOrderItemService.save(rawMaterialOrderItem);
    }

    @GetMapping("/findAll")
    public List<RawMaterialOrderItem> findAll(){
        return rawMaterialOrderItemService.findAll();
    }


}
