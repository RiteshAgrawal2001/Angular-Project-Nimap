package com.project.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString

public class Users {
    @Id
    private long userid;

    private String firstname;
    private String lastname;
    private Long mobilenumber;
    private Integer age;
    private String emailid;
    private String state;
    private String country;
    private String address;
    private String tags;
    private Boolean issubscribed;

}
