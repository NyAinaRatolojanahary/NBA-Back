package com.project.nba.mapping;


import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;

@Entity
public class Joueur {
    @Id
    @Column(name = "id", nullable = false)
    int id;
    @Column(name = "nom")
    String nom;
    @Column(name = "prenom")
    String prenom;
    @Column(name = "dtn")
    @JdbcTypeCode(SqlTypes.DATE)
    Date dtn;



//Encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDtn() {
        return dtn;
    }

    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }




//    consrtuctors
    public Joueur() {
    }
    public Joueur(int id, String nom, String prenom, Date dtn) {
        this.setId(id);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setDtn(dtn);
    }
}
