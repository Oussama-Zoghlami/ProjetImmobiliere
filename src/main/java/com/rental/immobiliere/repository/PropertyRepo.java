package com.rental.immobiliere.repository;

import com.rental.immobiliere.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepo extends JpaRepository <Property, Long> {
    @Query(value = "select * from Property",nativeQuery = true)
    List<Property> getAllBy(Long idProperty);
}
