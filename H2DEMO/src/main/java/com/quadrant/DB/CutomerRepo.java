package com.quadrant.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quadrant.model.Customer;

@Repository
public interface CutomerRepo extends JpaRepository<Customer, Integer> {

}
