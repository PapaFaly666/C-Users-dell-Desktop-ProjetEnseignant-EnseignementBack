package com.example.enseignementback.repartition.service;

import com.example.enseignementback.maquette.model.Classe;
import com.example.enseignementback.repartition.model.Per;
import com.example.enseignementback.repartition.repository.PerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PerService {
    private PerRepository perRepository;

    public void post(Per per){
        perRepository.save(per);
    }

    public List<Per> get(){
        return perRepository.findAll();
    }

    public Optional<Per> getPerId(long id){
        return perRepository.findById(id);
    }

    public void delete(long id){
        perRepository.deleteById(id);
    }

    public Per update(Per per){
        return perRepository.save(per);
    }
}
