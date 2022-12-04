package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.Supplier;
import co.soluthevnikbackend.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/findAll")
    public List<Supplier> findAll(){
        return supplierService.findAll();
    }

}
