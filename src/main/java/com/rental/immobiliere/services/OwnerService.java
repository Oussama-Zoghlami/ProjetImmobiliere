package com.rental.immobiliere.services;

import com.rental.immobiliere.entities.Owner;
import com.rental.immobiliere.entities.Property;

import java.util.List;

public interface OwnerService {

    public Owner addOwner(Owner owner);
    public Owner updateOwner(Owner owner);
    public Owner affichOwner(Long idOwner);
    public List<Owner> afficherListeOwner();
    public void deleteOwner(Long idOwner);

}
