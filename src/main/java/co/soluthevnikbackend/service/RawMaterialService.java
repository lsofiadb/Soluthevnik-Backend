package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.RawMaterial;
import co.soluthevnikbackend.repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialService {

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    public RawMaterial save(RawMaterial rawMaterial){
        return rawMaterialRepository.save(rawMaterial);
    }

    public List<RawMaterial> getAll(){
        return rawMaterialRepository.findAll();
    }
}
