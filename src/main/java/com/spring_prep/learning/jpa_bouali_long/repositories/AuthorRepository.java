package com.spring_prep.learning.jpa_bouali_long.repositories;

import com.spring_prep.learning.jpa_bouali_long.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Transactional
    @Modifying
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(int age, int id);


    List<Author> findAllByFirstName(String fn);

}
