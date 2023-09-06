package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
