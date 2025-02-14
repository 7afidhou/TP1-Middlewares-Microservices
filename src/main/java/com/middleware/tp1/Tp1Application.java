package com.middleware.tp1;

import com.middleware.tp1.entities.Etudiant;
import com.middleware.tp1.entities.Formation;
import com.middleware.tp1.repositories.EtudiantRep;
import com.middleware.tp1.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {

    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    FormationRep formationRep;


    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    Formation f1;
    Formation f2;
    f1=formationRep.save(new Formation(null,"firstformation",null));
    f2=formationRep.save(new Formation(null,"secondformation",null));


    etudiantRep.save(new Etudiant(null,"ali", Date.valueOf("2005-12-1"),20,f1,null));
    etudiantRep.save(new Etudiant(null,"chaima", Date.valueOf("2004-6-1"),20,f1,null));
    etudiantRep.save(new Etudiant(null,"ismail", Date.valueOf("2002-12-1"),20,f2,null));




    }

}
