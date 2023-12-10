package com.rental.immobiliere.services;

import com.rental.immobiliere.entities.Property;

import java.util.List;

public interface PropertyService {

    public Property addProperty(Property property);
    public Property updateProperty(Property property);
    public Property affichProperty(Long idProperty);
    public List <Property> afficherListeProperty();
    public void deleteProperty(Long idProperty);


}
