package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.SaleOrderItem;
import co.soluthevnikbackend.repository.SaleOrderItemRepository;
import co.soluthevnikbackend.repository.SaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOrderItemService {

    @Autowired
    private SaleOrderItemRepository saleOrderItemRepository;

    public SaleOrderItem save(SaleOrderItem saleOrderItem){
        return saleOrderItemRepository.save(saleOrderItem);
    }

    public List<SaleOrderItem> findAll(){
        return saleOrderItemRepository.findAll();
    }

}
