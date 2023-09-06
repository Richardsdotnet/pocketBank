package com.richards.pocketBank.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_messages")
public class Contacts {

        @Id
        @Column(name = "contact_id")
        private String contactId;

        @Column(name = "contact_name")
        private String contactName;

        @Column(name = "contact_email")
        private String contactEmail;

        private String subject;

        private String message;

    }
