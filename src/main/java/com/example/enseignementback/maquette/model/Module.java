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
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String cours;
    private Date duree;
    private String objectifs;
    private String description;
    private Date dateCreation;

    @ManyToOne
    private Ue ue;

    @ManyToOne
    private Ec ec;

    @ManyToOne
    private Maquette maquette;

    @ManyToOne
    private Semestre semestre;

    @JsonIgnore
    @OneToMany(mappedBy = "module")
    private List<Enseignement> enseignements;

}
