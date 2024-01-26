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
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int effectif;
    private Date dateCreation;
    private String libelle;
    private int nbrGroupe;
    private String desccription;

    @JsonIgnore
    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    private List<Groupe> groupes;

    @ManyToOne
    private Formation formation;

    @ManyToOne
    private Semestre semestre;

    @JsonIgnore
    @OneToMany(mappedBy = "classe")
    private List<Enseignement> enseignements;

}
