package com.rental.immobiliere.services;

import com.rental.immobiliere.entities.Owner;
import com.rental.immobiliere.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    OwnerRepo ownerRepo;

    @Override
    public Owner addOwner(Owner owner) {
        return ownerRepo.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return ownerRepo.save(owner);
    }

    @Override
    public Owner affichOwner(Long idOwner) {
        return ownerRepo.findById(idOwner).orElse(null);
    }

    @Override
    public List<Owner> afficherListeOwner() {
        return ownerRepo.findAll();
    }

    @Override
    public void deleteOwner(Long idOwner) {
        ownerRepo.deleteById(idOwner);
    }


}
