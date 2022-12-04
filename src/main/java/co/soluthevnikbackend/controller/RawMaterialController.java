package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.RawMaterial;
import co.soluthevnikbackend.service.RawMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/raw_material")
public class RawMaterialController {

    @Autowired
    private RawMaterialService rawMaterialService;

    @GetMapping("/findAll")
    public List<RawMaterial> findAll(){
        return rawMaterialService.getAll();
    }


}
