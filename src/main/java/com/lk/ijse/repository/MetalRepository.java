package com.lk.ijse.repository;

import com.lk.ijse.entity.Metal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MetalRepository extends JpaRepository<Metal, Integer> {

    @Query("SELECT count(m.metalId) FROM Metal m")
    int getMetalCount();
}
