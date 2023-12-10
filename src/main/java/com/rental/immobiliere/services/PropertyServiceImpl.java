package com.rental.immobiliere.services;

import com.rental.immobiliere.entities.Property;
import com.rental.immobiliere.repository.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    PropertyRepo propertyRepo;
    @Override
    public Property addProperty(Property property) {
        return propertyRepo.save(property);
    }

    @Override
    public Property updateProperty(Property property) {
        return propertyRepo.save(property);
    }

    @Override
    public Property affichProperty(Long idProperty) {
        return propertyRepo.findById(idProperty).orElse(null);
    }

    @Override
    public List <Property> afficherListeProperty() {
        return propertyRepo.findAll();
    }

    @Override
    public void deleteProperty(Long idProperty) {
        propertyRepo.deleteById(idProperty);
    }


}
