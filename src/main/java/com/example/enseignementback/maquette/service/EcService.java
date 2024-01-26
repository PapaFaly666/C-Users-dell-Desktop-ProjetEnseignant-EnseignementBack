package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.repository.EcRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EcService {
    private EcRepository ecRepository;
    public void post(Ec ec){
        ecRepository.save(ec);
    }

    public List<Ec> get(){
        return ecRepository.findAll();
    }

    public Optional<Ec> getEcById(long id){
        return ecRepository.findById(id);
    }

    public void delete(long id){
        ecRepository.deleteById(id);
    }

    public Ec update(Ec ec){
        return ecRepository.save(ec);
    }
}
