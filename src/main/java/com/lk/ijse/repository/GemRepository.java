package com.lk.ijse.repository;

import com.lk.ijse.entity.Gem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface GemRepository extends JpaRepository<Gem, Integer> {
    List<Gem> getGemByGivenDate(Date givenDate);

    @Query("SELECT count(g.gemId) FROM Gem g where g.givenDate=null")
    int getGemCount();
}
