package com.rental.immobiliere.repository;

import com.rental.immobiliere.entities.Owner;
import com.rental.immobiliere.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepo extends JpaRepository <Owner, Long> {
    @Query(value = "select * from Owner",nativeQuery = true)
    List<Owner> getAllBy(Long idOwner);
}
