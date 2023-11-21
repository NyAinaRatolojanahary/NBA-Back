package com.project.nba.mapping;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.sql.Timestamp;

@Entity
public class Match {
    @Id
    @Column(name = "id", nullable = false)
    int id;
    @Column(name = "date")
    @JdbcTypeCode(SqlTypes.TIMESTAMP)
    Timestamp date;


    @Column(name = "equipe1")
    @JdbcTypeCode(SqlTypes.INTEGER)
    int equipe1;

    @Column(name = "equipe2")
    @JdbcTypeCode(SqlTypes.INTEGER)
    int equipe2;


//    Encapsulation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    public int getEquipe1() {return equipe1;}
    public void setEquipe1(int equipe1) {
        this.equipe1 = equipe1;
    }

    public int getEquipe2() {
        return equipe2;
    }
    public void setEquipe2(int equipe2) {
        this.equipe2 = equipe2;
    }


//    constructors

    public Match() {
    }

    public Match(int id, Timestamp date, int equipe1, int equipe2) {
        this.setId(id);
        this.setDate(date);
        this.setEquipe1(equipe1);
        this.setEquipe2(equipe2);
    }
}

