package com.richards.pocketBank.repositories;

import com.richards.pocketBank.models.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
