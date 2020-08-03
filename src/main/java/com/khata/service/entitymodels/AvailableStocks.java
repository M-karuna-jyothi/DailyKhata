package com.khata.service.entitymodels;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class AvailableStocks {
    @Id
    int id;
    int batchId;
    int flavourId;
    int availableQuantity;
    int soldQuantity;
    int intransitQuantity;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date createdOn;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date updatedOn;
}
