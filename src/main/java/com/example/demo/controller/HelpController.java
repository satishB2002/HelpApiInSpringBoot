package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HelpArticle;
import com.example.demo.entity.SupportTicket;
import com.example.demo.service.HelpService;
@RestController
@RequestMapping("/help")
public class HelpController {

    @Autowired
    private HelpService helpService;
    @PostMapping("/tickets")
    public SupportTicket createSupportTicket(@RequestBody SupportTicket supportTicket) {
        return helpService.createSupportTicket(supportTicket);
    }
    
    
    @GetMapping("/Hii")
    public void input() {
    	System.out.println("HIIIIIIII");
    }
    @GetMapping("/articles")
    public List<HelpArticle> getAllHelpArticles() {
        return helpService.getAllHelpArticles();
    }

    @GetMapping("/articles/{id}")
    public HelpArticle getHelpArticleById(@PathVariable("id") Long id) {
        return helpService.getHelpArticleById(id);
    }
    @GetMapping("/tickets/{id}")
    public SupportTicket getSupportTicketById(@PathVariable("id") Long id) {
        return helpService.getSupportTicketById(id);
    }

    @PutMapping("/tickets/{id}")
    public SupportTicket updateSupportTicket(@PathVariable("id") Long id, @RequestBody SupportTicket ticket) {
        return helpService.updateSupportTicket(id, ticket);
    }

}

