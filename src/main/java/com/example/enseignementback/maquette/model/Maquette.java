package com.example.enseignementback.maquette.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Maquette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String libelle;
    private int credit;
    private int coefficient;
    private String code;
    private int cumulCmTdTp;
    private int volumeht;
    private int tpe;

    @JsonIgnore
    @OneToMany(mappedBy = "maquette")
    private List<Module> modules;



}
