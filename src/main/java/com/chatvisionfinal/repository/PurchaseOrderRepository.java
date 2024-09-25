package com.chatvisionfinal.repository;

import com.chatvisionfinal.entity.EPurchaseOrder;
import com.chatvisionfinal.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, String> {

}
