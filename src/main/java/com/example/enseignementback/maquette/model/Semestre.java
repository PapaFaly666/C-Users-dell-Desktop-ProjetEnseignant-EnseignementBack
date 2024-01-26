package com.example.enseignementback.maquette.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String libelle;
    private String description;
    private Date dateCreation;

    @JsonIgnore
    @OneToMany(mappedBy = "semestre")
    private List<Module> modules;

    @OneToMany(mappedBy = "semestre")
    private List<Classe> classes;
}
