package com.example.enseignementback.maquette.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String description;
    private Date dateCreation;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Maquette maquette;

    @ManyToOne
    private Filiere filiere;

    @ManyToOne
    private Niveau niveau;

    @JsonIgnore
    @OneToMany(mappedBy = "formation", cascade = CascadeType.ALL)
    private List<Classe> classes;
}
