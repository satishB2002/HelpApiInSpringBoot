package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HelpArticle;
import com.example.demo.entity.SupportTicket;
import com.example.demo.repository.HelpArticleRepository;
import com.example.demo.repository.SupportTicketRepository;

@Service
public class HelpService {

    @Autowired
    private HelpArticleRepository articleRepository;

    @Autowired
    private SupportTicketRepository ticketRepository;

    public List<HelpArticle> getAllHelpArticles() {
        return articleRepository.findAll();
    }

    public HelpArticle getHelpArticleById(Long id) {
        return articleRepository.findById(id)
                .orElseThrow();
    }

    public SupportTicket createSupportTicket(SupportTicket supportTicket) {
       
        return ticketRepository.save(supportTicket);
    }

    public SupportTicket getSupportTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow();
    }

    public SupportTicket updateSupportTicket(Long id, SupportTicket ticket) {
        SupportTicket existingTicket = ticketRepository.findById(id)
                .orElseThrow();

        // Update the existing ticket with new values
        existingTicket.setTitle(ticket.getTitle());
        existingTicket.setDescription(ticket.getDescription());
        // ...

        return ticketRepository.save(existingTicket);
    }

}
