package com.spring_prep.learning.jpa_bouali_long.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "author")
@Entity
public class Author {

    @Id
    /*
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Author_sequence"
    )

    @SequenceGenerator(
            name = "Author_sequence",
            sequenceName = "Author_sequence",
            allocationSize = 1
    )*/

    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "id_gen"
    )
    @TableGenerator(
            name = "id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            pkColumnValue = "id_value",
            allocationSize = 1
    )
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

    // First figure out who is the owner of the relationship - responsible for managing the FK in the relationship table

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
