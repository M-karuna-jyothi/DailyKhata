package com.khata.service.entitymodels;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class VendorInformation {
    @Id
    private int id;
    private String name;
    private int phoneNumber;
    private  String address;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date createdOn;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date updatedOn;


}
