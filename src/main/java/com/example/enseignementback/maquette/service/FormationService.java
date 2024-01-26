package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.model.Formation;
import com.example.enseignementback.maquette.repository.FormationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FormationService {
    private FormationRepository formationRepository;

    public void post(Formation formation){
        formationRepository.save(formation);
    }

    public List<Formation> get(){
        return formationRepository.findAll();
    }

    public Optional<Formation> getFormationById(long id){
        return formationRepository.findById(id);
    }

    public void delete(long id){
        formationRepository.deleteById(id);
    }

    public Formation update(Formation formation){
        return formationRepository.save(formation);
    }
}
