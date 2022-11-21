package com.imran.jpa.repository;

import com.imran.jpa.entity.Amount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmountRepository extends JpaRepository<Amount,Integer> {
}
