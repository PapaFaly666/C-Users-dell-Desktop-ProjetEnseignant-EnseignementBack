package com.example.enseignementback.maquette.model;

import com.example.enseignementback.repartition.model.Enseignant;
import com.example.enseignementback.repartition.model.Repartition;
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
public class Enseignement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String libelle;
    private String description;
    private String objectifs;
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    @ManyToOne
    private Groupe groupe;

    @ManyToOne
    private Classe classe;

    @ManyToOne
    private Enseignant enseignant;

    @JsonIgnore
    @OneToMany(mappedBy = "enseignement")
    private List<Repartition> repartitions;
}
