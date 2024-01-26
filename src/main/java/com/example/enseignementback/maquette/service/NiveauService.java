package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Filiere;
import com.example.enseignementback.maquette.model.Niveau;
import com.example.enseignementback.maquette.repository.NiveauRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NiveauService {
    private NiveauRepository niveauRepository;

    public void post(Niveau niveau){
        niveauRepository.save(niveau);
    }

    public List<Niveau> get(){
        return niveauRepository.findAll();
    }

    public Optional<Niveau> getNiveauById(long id){
        return niveauRepository.findById(id);
    }

    public void delete(long id){
        niveauRepository.deleteById(id);
    }

    public Niveau update(Niveau niveau){
        return niveauRepository.save(niveau);
    }
}
