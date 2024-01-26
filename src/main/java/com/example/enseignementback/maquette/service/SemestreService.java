package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Cycle;
import com.example.enseignementback.maquette.model.Semestre;
import com.example.enseignementback.maquette.repository.SemestreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SemestreService {
    private SemestreRepository semestreRepository;

    public void post(Semestre semestre){
        semestreRepository.save(semestre);
    }

    public List<Semestre> get(){
        return semestreRepository.findAll();
    }

    public Optional<Semestre> getSemestreById(long id){
        return semestreRepository.findById(id);
    }

    public void delete(long id){
        semestreRepository.deleteById(id);
    }

    public Semestre update(Semestre semestre){
        return semestreRepository.save(semestre);
    }
}
