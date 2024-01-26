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
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private int numero;
    private int effectif;
    private String description;
    private Date dateCreation;

    @JsonIgnore
    @OneToMany(mappedBy = "groupe")
    private List<Enseignement> enseignements;

    @ManyToOne
    private Classe classe;

}
