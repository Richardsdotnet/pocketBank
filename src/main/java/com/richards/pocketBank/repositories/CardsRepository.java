package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards, Long> {
}
