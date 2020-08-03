package com.khata.service.entitymodels;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class UserInfo {
    @Id
    int id;
    String userName;
    int phoneNumber;
    String email;
    String address;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date createdOn;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    Date updatedOn;
}
