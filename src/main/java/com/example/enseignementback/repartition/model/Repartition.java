package com.example.enseignementback.repartition.model;

import com.example.enseignementback.EmploiDuTemp.model.Seance;
import com.example.enseignementback.maquette.model.Enseignement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Repartition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Enseignant enseignant;

    @ManyToOne
    private Enseignement enseignement;

    @OneToMany(mappedBy = "repartition")
    private List<Seance> seances;

}
