package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTransactionRepository extends JpaRepository<AccountTransactions, Long> {
}
