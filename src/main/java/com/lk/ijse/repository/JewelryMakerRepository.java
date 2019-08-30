package com.lk.ijse.repository;

import com.lk.ijse.entity.JewelryMaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JewelryMakerRepository extends JpaRepository<JewelryMaker, Integer> {

    @Query("SELECT count(j.jewMId) FROM JewelryMaker j")
    int getMakersCount();
}
