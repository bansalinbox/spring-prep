package com.spring_prep.learning.jpa_bouali_long.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("V") --> use with @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@PrimaryKeyJoinColumn(name = "vedio_id")
public class Vedio extends Resources{

    private int length;
}
