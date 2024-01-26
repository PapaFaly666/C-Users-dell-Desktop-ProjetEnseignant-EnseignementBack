package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Classe;
import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.repository.ClasseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClasseService {
    private ClasseRepository classeRepository;

    public void post(Classe classe){
        classeRepository.save(classe);
    }

    public List<Classe> get(){
        return classeRepository.findAll();
    }

    public Optional<Classe> getClasseById(long id){
        return classeRepository.findById(id);
    }

    public void delete(long id){
        classeRepository.deleteById(id);
    }

    public Classe update(Classe classe){
        return classeRepository.save(classe);
    }
}
