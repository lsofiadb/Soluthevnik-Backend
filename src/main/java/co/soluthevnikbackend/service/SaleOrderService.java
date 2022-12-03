package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.SaleOrder;
import co.soluthevnikbackend.repository.SaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOrderService {

    @Autowired
    private SaleOrderRepository saleOrderRepository;

    public SaleOrder save(SaleOrder saleOrder){
        return saleOrderRepository.save(saleOrder);
    }

    public List<SaleOrder> getAll(){
        return saleOrderRepository.findAll();
    }

}
