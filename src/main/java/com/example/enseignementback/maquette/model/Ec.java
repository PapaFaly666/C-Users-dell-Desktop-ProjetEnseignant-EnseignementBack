package com.example.enseignementback.maquette.model;

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
public class Ec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String code;
    private String cm;
    private String td;
    private String tp;
    private String tpe;
    private int cumulcmtdtp;
    private int volumeht;
    private int coefficient;
    private String description;
    private Date dateCreation;

    @ManyToOne
    private Ue ue;

    @OneToMany(mappedBy = "ec")
    private List<Module> modules;
}
