package com.khata.service.repositories;

import com.khata.service.entitymodels.AvailableStocks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AvailableStocksRepository extends JpaRepository<AvailableStocks,Integer> {

    List<AvailableStocks> findByCreatedOn(Date date);
}
