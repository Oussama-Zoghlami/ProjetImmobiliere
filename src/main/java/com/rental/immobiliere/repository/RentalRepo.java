package com.rental.immobiliere.repository;

import com.rental.immobiliere.entities.Property;
import com.rental.immobiliere.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepo extends JpaRepository <Rental,Long> {
    @Query(value = "select * from Rental",nativeQuery = true)
    List<Rental> getAllBy(Long idRental);
}
