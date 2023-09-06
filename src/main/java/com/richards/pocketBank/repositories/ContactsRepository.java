package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
}
