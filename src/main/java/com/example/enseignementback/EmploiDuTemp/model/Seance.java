package com.example.enseignementback.EmploiDuTemp.model;

import com.example.enseignementback.repartition.model.Repartition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String libelle;

    @ManyToOne
    private Emploi emploi;

    @ManyToOne
    private Repartition repartition;

    @OneToOne(cascade = CascadeType.ALL)
    private Deroulement deroulement;

    @ManyToOne
    private Salle salle;
}
