package com.khata.service.repositories;

import com.khata.service.entitymodels.StockVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockVersionRepository extends JpaRepository<StockVersion,Integer> {
}
