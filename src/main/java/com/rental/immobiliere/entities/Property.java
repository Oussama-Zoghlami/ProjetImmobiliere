package com.rental.immobiliere.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name ="property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProperty;
    private String adresse;
    private Double price;

}
