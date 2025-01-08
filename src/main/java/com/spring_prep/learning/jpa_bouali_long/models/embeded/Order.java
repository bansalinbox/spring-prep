package com.spring_prep.learning.jpa_bouali_long.models.embeded;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "_order")
public class Order {

    @EmbeddedId
    private OrderId id;

    private String orderInfo;

    private String anotherField;
}
