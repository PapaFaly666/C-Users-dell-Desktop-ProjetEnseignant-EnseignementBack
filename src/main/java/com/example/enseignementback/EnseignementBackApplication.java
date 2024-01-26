package com.example.enseignementback;

import com.example.enseignementback.maquette.model.Ue;
import com.example.enseignementback.maquette.repository.UeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnseignementBackApplication implements CommandLineRunner {
    @Autowired
    private UeRepository ueRepository;
    public static void main(String[] args) {
        SpringApplication.run(EnseignementBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ueRepository.save(new Ue(1L,"Base de donnée","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(2L,"Base de donnée","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(3L,"Reseaux et telecom","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(4L,"Administration reseau","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(5L,"Gestion de projet","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(6L,"Optimisation","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(7L,"Programmation","INF444",5,4,"Cour de donnee",null,null,null));
        ueRepository.save(new Ue(8L,"Algorithme","INF444",5,4,"Cour de donnee",null,null,null));
    }
}
