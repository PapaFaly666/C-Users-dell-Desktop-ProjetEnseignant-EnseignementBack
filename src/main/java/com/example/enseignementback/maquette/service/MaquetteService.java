package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.model.Maquette;
import com.example.enseignementback.maquette.repository.MaquetteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MaquetteService {
    private MaquetteRepository maquetteRepository;

    public void post(Maquette maquette){
        maquetteRepository.save(maquette);
    }

    public List<Maquette> get(){
        return maquetteRepository.findAll();
    }

    public Optional<Maquette> getMaquetteById(long id){
        return maquetteRepository.findById(id);
    }

    public void delete(long id){
        maquetteRepository.deleteById(id);
    }

    public Maquette update(Maquette maquette){
        return maquetteRepository.save(maquette);
    }
}
