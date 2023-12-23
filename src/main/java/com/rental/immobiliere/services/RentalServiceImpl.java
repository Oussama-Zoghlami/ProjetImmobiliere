package com.rental.immobiliere.services;

import com.rental.immobiliere.entities.Owner;
import com.rental.immobiliere.entities.Rental;
import com.rental.immobiliere.repository.RentalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentalServiceImpl implements RentalService{
    @Autowired
    RentalRepo rentalRepo;
    @Override
    public Rental addRental(Rental rental) {

        return rentalRepo.save(rental);
    }

    @Override
    public Rental updateRental(Rental rental)
    {
        return rentalRepo.save(rental);
    }

    @Override
    public Rental affichRental(Long idRental) {
        return rentalRepo.findById(idRental).orElse(null);
    }


    @Override
    public List<Rental> affichListeRental() {

        return rentalRepo.findAll();
    }

    @Override
    public void deleteRental(Long idRental) {

        rentalRepo.deleteById(idRental);
    }
}
