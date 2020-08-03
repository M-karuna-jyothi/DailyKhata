package com.khata.service.repositories;

import com.khata.service.entitymodels.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {

}
