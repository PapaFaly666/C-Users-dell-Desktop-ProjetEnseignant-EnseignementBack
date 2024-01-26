package com.example.enseignementback.maquette.service;


import com.example.enseignementback.maquette.model.Groupe;
import com.example.enseignementback.maquette.repository.GroupeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GroupeService {
    private GroupeRepository groupeRepository;

    public void post(Groupe groupe){
        groupeRepository.save(groupe);
    }

    public List<Groupe> get(){
        return groupeRepository.findAll();
    }

    public Optional<Groupe> getGroupeById(long id){
        return groupeRepository.findById(id);
    }

    public void delete(long id){
        groupeRepository.deleteById(id);
    }

    public Groupe update(Groupe groupe){
        return groupeRepository.save(groupe);
    }
}
