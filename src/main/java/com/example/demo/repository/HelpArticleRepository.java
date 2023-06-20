package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HelpArticle;

@Repository
public interface HelpArticleRepository extends JpaRepository<HelpArticle, Long> {

	Optional<HelpArticle> findById(Long id);

}

