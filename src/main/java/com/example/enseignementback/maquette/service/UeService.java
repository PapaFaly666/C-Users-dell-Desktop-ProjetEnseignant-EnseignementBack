package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Ue;
import com.example.enseignementback.maquette.repository.UeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UeService {
    private UeRepository ueRepository;

    public void post(Ue ue){
        ueRepository.save(ue);
    }

    public List<Ue> get(){
        return ueRepository.findAll();
    }

    public Optional<Ue> getById(long id){
        return ueRepository.findById(id);
    }

    public void delete(long id){
        ueRepository.deleteById(id);
    }

    public Ue update(Ue ue){
        return ueRepository.save(ue);
    }
}
