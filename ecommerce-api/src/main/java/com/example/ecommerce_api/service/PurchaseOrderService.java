package com.example.ecommerce_api.service;

import com.example.ecommerce_api.model.PurchaseOrder;
import com.example.ecommerce_api.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService
{
    //Spring boot architecture main feature
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    //Method to save the order
    public PurchaseOrder saveOrder(PurchaseOrder purchaseOrder){
        return purchaseOrderRepository.save(purchaseOrder);
    }
}
