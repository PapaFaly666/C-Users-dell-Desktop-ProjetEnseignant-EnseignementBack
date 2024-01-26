package com.example.enseignementback.repartition.service;

import com.example.enseignementback.repartition.model.Per;
import com.example.enseignementback.repartition.model.Vac;
import com.example.enseignementback.repartition.repository.VacRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VacService {
    private VacRepository vacRepository;

    public void post(Vac vac){
        vacRepository.save(vac);
    }

    public List<Vac> get(){
        return vacRepository.findAll();
    }

    public Optional<Vac> getVacId(long id){
        return vacRepository.findById(id);
    }

    public void delete(long id){
        vacRepository.deleteById(id);
    }

    public Vac update(Vac vac){
        return vacRepository.save(vac);
    }
}
