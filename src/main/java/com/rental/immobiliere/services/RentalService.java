package com.rental.immobiliere.services;

import com.rental.immobiliere.entities.Owner;
import com.rental.immobiliere.entities.Rental;

import java.util.List;

public interface RentalService {

    public Rental addRental(Rental rental);
    public Rental updateRental(Rental rental);
    public Rental affichRental(Long idRental);
    public List<Rental> affichListeRental();
    public void deleteRental(Long idRental);


}
