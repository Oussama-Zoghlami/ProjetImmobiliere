package com.rental.immobiliere.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name ="rental")

public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRental;
    private String tenant;
    private Double monthlyRent;
    @OneToOne

    private Property property;
    @OneToOne

    private Owner owner;


}
