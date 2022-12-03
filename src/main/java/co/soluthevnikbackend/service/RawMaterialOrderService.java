package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.RawMaterialOrder;
import co.soluthevnikbackend.repository.RawMaterialOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialOrderService {

    @Autowired
    private RawMaterialOrderRepository rawMaterialOrderRepository;

    public RawMaterialOrder save(RawMaterialOrder rawMaterialOrder){
        return rawMaterialOrderRepository.save(rawMaterialOrder);
    }

    public List<RawMaterialOrder> getAll(){
        return rawMaterialOrderRepository.findAll();
    }

    public RawMaterialOrder findById(Long id){
        return rawMaterialOrderRepository.findById(id).get();
    }

}
