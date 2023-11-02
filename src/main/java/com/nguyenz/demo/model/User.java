package com.nguyenz.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private byte gender;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
