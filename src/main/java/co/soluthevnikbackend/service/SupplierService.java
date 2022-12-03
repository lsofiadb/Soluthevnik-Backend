package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.Supplier;
import co.soluthevnikbackend.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier findById(Long id){
        return supplierRepository.findById(id).get();
    }

    public List<Supplier> findAll(){
        return supplierRepository.findAll();
    }

}
