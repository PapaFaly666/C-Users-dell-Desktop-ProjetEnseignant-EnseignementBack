package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Filiere;
import com.example.enseignementback.maquette.model.Formation;
import com.example.enseignementback.maquette.repository.FiliereRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FiliereService {
    private FiliereRepository filiereRepository;

    public void post(Filiere filiere){
        filiereRepository.save(filiere);
    }

    public List<Filiere> get(){
        return filiereRepository.findAll();
    }

    public Optional<Filiere> getFiliereById(long id){
        return filiereRepository.findById(id);
    }

    public void delete(long id){
        filiereRepository.deleteById(id);
    }

    public Filiere update(Filiere filiere){
        return filiereRepository.save(filiere);
    }
}
