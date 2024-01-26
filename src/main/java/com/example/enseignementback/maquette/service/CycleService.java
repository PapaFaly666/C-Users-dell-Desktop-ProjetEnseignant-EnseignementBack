package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Cycle;
import com.example.enseignementback.maquette.model.Filiere;
import com.example.enseignementback.maquette.repository.CycleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CycleService {
    private CycleRepository cycleRepository;

    public void post(Cycle cycle){
        cycleRepository.save(cycle);
    }

    public List<Cycle> get(){
        return cycleRepository.findAll();
    }

    public Optional<Cycle> getCycleById(long id){
        return cycleRepository.findById(id);
    }

    public void delete(long id){
        cycleRepository.deleteById(id);
    }

    public Cycle update(Cycle cycle){
        return cycleRepository.save(cycle);
    }
}
