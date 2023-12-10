package com.rental.immobiliere.controllers;

import com.rental.immobiliere.entities.Property;
import com.rental.immobiliere.services.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("property")
public class PropertyController {
    @Autowired
    PropertyService propertyService;
    @PostMapping("/addproperty")
    public Property addProperty(@RequestBody Property property){
        Property p = propertyService.addProperty(property);
        return p;
    }
    @PutMapping("/updateproperty")
    public Property updateProperty(@RequestBody Property property){
        Property p=propertyService.updateProperty(property);
        return p;
    }

    @GetMapping("/affichproperty/{property-id}")
    public Property affichProperty(@PathVariable ("property-id")Long idProperty){
        Property pro=propertyService.affichProperty(idProperty);
        return pro;
    }

    @GetMapping("/afficherlisteproperty")
    public List< Property> afficherListeProperty(){
        List<Property> listeProperty = propertyService.afficherListeProperty();
        return listeProperty;

    }

    @DeleteMapping("/deleteproperty/{property-id}")
    public void deleteProperty(@PathVariable ("property-id")Long idProperty){
        propertyService.deleteProperty(idProperty);

    }








}
