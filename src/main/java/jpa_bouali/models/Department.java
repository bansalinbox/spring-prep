package jpa_bouali.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Department {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;


    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
