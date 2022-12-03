package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.RawMaterialOrderItem;
import co.soluthevnikbackend.repository.RawMaterialOrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialOrderItemService {

    @Autowired
    private RawMaterialOrderItemRepository rawMaterialOrderItemRepository;

    public RawMaterialOrderItem save(RawMaterialOrderItem rawMaterialOrderItem){
        return rawMaterialOrderItemRepository.save(rawMaterialOrderItem);
    }

    public List<RawMaterialOrderItem> findAll(){
        return rawMaterialOrderItemRepository.findAll();
    }

}
