package com.example.ecommerce_api.repository;

import com.example.ecommerce_api.model.PurchaseOrder;
import com.example.ecommerce_api.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long>
{
}
