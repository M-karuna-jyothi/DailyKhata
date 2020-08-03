package com.khata.service.repositories;

import com.khata.service.entitymodels.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
