package com.khata.service.entitymodels;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class StockVersion {
    @Id
    private int id;
    private int stockId;
    private String attribute;
    private String oldVersion;
    private String newVersion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date createdOn;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date updatedOn;
    private int updatedBy;
    private int locationId;

}
