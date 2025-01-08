package com.spring_prep.learning.jpa_bouali_long.repositories;

import com.spring_prep.learning.jpa_bouali_long.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Integer> {
}