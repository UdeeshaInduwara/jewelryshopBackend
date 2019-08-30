package com.lk.ijse.repository;

import com.lk.ijse.entity.JewelryMakingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JewelryMakingOrderRepository extends JpaRepository<JewelryMakingOrder, Integer> {

    @Query("SELECT count(o.jewMDId) FROM JewelryMakingOrder o")
    int getOrdersCount();
}
