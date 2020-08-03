package com.khata.service.repositories;

import com.khata.service.entitymodels.BatchInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchInformationRepository extends JpaRepository<BatchInformation,Integer> {
}
