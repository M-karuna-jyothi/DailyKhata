package com.khata.service.entitymodels;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class BatchInformation {
    @Id
    private int id;
    private int companyId;
    private int quantity;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    private Date unloadedAt;
    private double invoicePrice;
    private int receivedBy;
}
