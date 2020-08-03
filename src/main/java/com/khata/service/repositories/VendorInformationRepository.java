package com.khata.service.repositories;

import com.khata.service.entitymodels.VendorInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorInformationRepository extends JpaRepository<VendorInformation,Integer> {
}
