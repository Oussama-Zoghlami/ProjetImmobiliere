package com.rental.immobiliere.controllers;

import com.rental.immobiliere.entities.Owner;

import com.rental.immobiliere.entities.Property;
import com.rental.immobiliere.repository.OwnerRepo;
import com.rental.immobiliere.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @PostMapping("/addowner")
    public Owner addOwner(@RequestBody Owner owner){
        Owner o =ownerService.addOwner(owner);
        return o;
    }

    @PutMapping("/updateOwner")
    public Owner updateOwner(@RequestBody Owner owner){
        Owner o=ownerService.updateOwner(owner);
        return o;
    }

    @GetMapping("/affichowner/{owner-id}")
    public Owner affichOwner(@PathVariable ("owner-id")Long idOwner){
        Owner o=ownerService.affichOwner(idOwner);
        return o;
    }


    @GetMapping("/afficherlisteowner")
    public List< Owner> afficherListeOwner(){
        List<Owner> listeOwner = ownerService.afficherListeOwner();
        return listeOwner;

    }

    @DeleteMapping("/deleteowner/{owner-id}")
    public void deleteOwner(@PathVariable ("owner-id")Long idOwner){
        ownerService.deleteOwner(idOwner);

    }












}
