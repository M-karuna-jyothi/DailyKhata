package com.khata.service.entitymodels;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class FlavourInformation {
    @Id
    private int id;
    private int companyId;
    private String brand;
    private String flavour;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date createdOn;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date updatedOn;








}
