package com.khata.service.repositories;

import com.khata.service.entitymodels.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Integer> {
    List<Test> findAll();

    Test findById(int id);

    List<Test> findByName(String name);

    @Query("select t from Test t where t.name = :name and t.description = :description")
    List<Test> findByNameAndDescription(@Param("name") String name,
                                        @Param("description") String description);
//List<Test> findByNameAndDescription(String name, String description);
}
