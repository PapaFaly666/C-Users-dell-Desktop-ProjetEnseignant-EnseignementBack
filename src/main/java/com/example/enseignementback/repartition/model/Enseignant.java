package com.example.enseignementback.repartition.model;

import com.example.enseignementback.maquette.model.Enseignement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",length = 3)
@Data
public abstract class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private  String grade;

    @JsonIgnore
    @OneToMany(mappedBy = "enseignant")
    private List<Enseignement> enseignements;

    @OneToMany(mappedBy = "enseignant")
    private List<Repartition> repartitions;

}
