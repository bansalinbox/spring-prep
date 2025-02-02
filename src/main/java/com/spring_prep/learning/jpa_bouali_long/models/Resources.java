package com.spring_prep.learning.jpa_bouali_long.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "resource_type")
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.JOINED)
public class Resources extends BaseEntity{

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
