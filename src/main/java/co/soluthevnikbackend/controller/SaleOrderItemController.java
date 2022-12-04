package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.SaleOrderItem;
import co.soluthevnikbackend.service.SaleOrderItemService;
import co.soluthevnikbackend.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale_order_item")
public class SaleOrderItemController {

    @Autowired
    private SaleOrderItemService saleOrderItemService;

    @PostMapping("/save")
    public SaleOrderItem save(@RequestBody SaleOrderItem saleOrderItem){
        return saleOrderItemService.save(saleOrderItem);
    }

    @GetMapping("/findAll")
    public List<SaleOrderItem> findAll(){
        return saleOrderItemService.findAll();
    }

}
