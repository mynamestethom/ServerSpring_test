package com.example.springsamsung.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column (name = "firstname")
    private String firstname;
    @Column (name = "lastname")
    private String lastname;
    @Column (name = "midllename")
    private String midllename;
    @Column (name = "bith")
    private String bith;
    @Column (name = "photoUrl")
    private String photoUrl;
    @Column (name = "floor")
    private String floor;
}
