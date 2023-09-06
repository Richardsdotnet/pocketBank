package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepository extends JpaRepository<Loans,Long> {
}
