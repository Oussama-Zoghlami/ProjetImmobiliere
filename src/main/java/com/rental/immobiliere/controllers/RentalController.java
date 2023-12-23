package com.rental.immobiliere.controllers;

import com.rental.immobiliere.entities.Property;
import com.rental.immobiliere.entities.Rental;
import com.rental.immobiliere.services.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("rental")
public class RentalController {
    @Autowired
    RentalService rentalService;


    @PostMapping("/addrental")
    public Rental addRental(@RequestBody Rental rental){
        Rental r = rentalService.addRental(rental);
        return r;
    }
    @PutMapping("/updaterental")
    public Rental updateRental(@RequestBody Rental rental){
        Rental r=rentalService.updateRental(rental);
        return r;
    }

    @GetMapping("/affichrental/{rental-id}")
    public Rental affichRental(@PathVariable ("rental-id")Long idRental){
        Rental r=rentalService.affichRental(idRental);
        return r;
    }

    @GetMapping("/afficherlisterental")
    public List< Rental> affichListeRental(){
        List<Rental> listeRental = rentalService.affichListeRental();
        return listeRental;

    }

    @DeleteMapping("/deleterental/{rental-id}")
    public void deleteRental(@PathVariable ("rental-id")Long idRental){
        rentalService.deleteRental(idRental);

    }
}
