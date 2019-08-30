package com.lk.ijse.repository;

import com.lk.ijse.entity.Gem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface GemRepository extends JpaRepository<Gem, Integer> {
    List<Gem> getGemByGivenDate(Date givenDate);
}
