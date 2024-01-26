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
public class Ue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String code;
    private int credit;
    private int coefficient;
    private String description;
    private Date dateCreation;

    @OneToMany(mappedBy = "ue")
    private List<Ec> ecs;

    @JsonIgnore
    @OneToMany(mappedBy = "ue")
    private List<Module> modules;
}
