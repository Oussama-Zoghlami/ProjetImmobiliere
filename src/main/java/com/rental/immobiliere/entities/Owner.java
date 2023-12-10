package com.rental.immobiliere.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idOwner;
    private String name;
    private String contactInformation;

}
