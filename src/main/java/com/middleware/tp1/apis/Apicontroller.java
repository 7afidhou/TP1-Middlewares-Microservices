package com.middleware.tp1.apis;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.middleware.tp1.entities.Etudiant;
import com.middleware.tp1.repositories.EtudiantRep;
import com.middleware.tp1.repositories.FormationRep;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class Apicontroller {
    @Autowired
    FormationRep formationRep;
    @Autowired
    EtudiantRep etudiantRep;



    @GetMapping("/etudiant/all")

    public List<Etudiant> getAllEtudiant() {
        return etudiantRep.findAll();
    }

    @GetMapping("/etudiant/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long id) {
        return etudiantRep.findById(id).get();
    }

    @PostMapping("/etudiant")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant,@RequestParam("idf") Long idFormation) {

        etudiant.setFormation(formationRep.findById(idFormation).get());
        return etudiantRep.save(etudiant);
    }



}
