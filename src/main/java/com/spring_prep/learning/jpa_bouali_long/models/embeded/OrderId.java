package com.spring_prep.learning.jpa_bouali_long.models.embeded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Embeddable()
public class OrderId implements Serializable {

    private String username;

    private LocalDateTime orderDate;

}
