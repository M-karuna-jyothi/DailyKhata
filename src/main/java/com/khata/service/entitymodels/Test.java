package com.khata.service.entitymodels;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
@Data
public class Test {
    @Id
    int id;
    String name;
    String description;
}
