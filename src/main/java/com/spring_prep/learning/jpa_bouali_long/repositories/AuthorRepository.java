package com.spring_prep.learning.jpa_bouali_long.repositories;

import com.spring_prep.learning.jpa_bouali_long.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
