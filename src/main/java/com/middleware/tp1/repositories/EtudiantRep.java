package com.middleware.tp1.repositories;

import com.middleware.tp1.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EtudiantRep extends JpaRepository<Etudiant, Long> {

    List<Etudiant> findEtudiantByIdEtudiant(Long idEtudiant);
    List<Etudiant> findEtudiantByNomStartingWith(String prefix);
@Query("select  e.nom from Etudiant e where e.idEtudiant=:ide")
    String findEtudiants(Long ide);


}




