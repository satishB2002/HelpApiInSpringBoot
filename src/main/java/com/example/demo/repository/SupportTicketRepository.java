package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SupportTicket;

@Repository
public interface SupportTicketRepository extends JpaRepository<SupportTicket, Long> {

	
}

