package com.khata.service.entitymodels;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class IntransitInformation {
    @Id
    private int id;
    private int userId;
    private int stockId;
    private int quantity;

}


