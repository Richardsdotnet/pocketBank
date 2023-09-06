package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
