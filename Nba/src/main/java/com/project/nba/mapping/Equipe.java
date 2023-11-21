package com.project.nba.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Equipe {
    @Id
    @Column(name = "id", nullable = false)

    int id;
    @Column(name = "initial")
    String initial;

    @Column(name = "equipe")
    String equipe;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getInitial() {
        return initial;
    }
    public void setInitial(String initial) {
        this.initial = initial;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }







//    Constructors

    public Equipe() {
    }

    public Equipe(int id, String initial, String equipe) {
        this.setId(id);
        this.setInitial(initial);
        this.setEquipe(equipe);
    }
}
