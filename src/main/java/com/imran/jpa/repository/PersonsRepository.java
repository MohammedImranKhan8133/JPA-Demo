package com.imran.jpa.repository;

import com.imran.jpa.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<Persons,Integer> {
   @Query(
           value = "SELECT * FROM persons s where s.address = ?1",
           nativeQuery = true
   )
   public Persons findByaddress(String address);
}
