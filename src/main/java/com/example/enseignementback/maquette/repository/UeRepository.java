package com.example.enseignementback.maquette.repository;

import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.model.Ue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UeRepository extends JpaRepository<Ue,Long> {
    @Query("SELECT e FROM Ec e WHERE e.ue = ?1")
    List<Ec> findByEc(Ue ue);

    Page<Ue> findByLibelleContains(String kw, Pageable pageable);
}
