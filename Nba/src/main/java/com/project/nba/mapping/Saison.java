package com.project.nba.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;

public class Saison {
    @Id
    @Column(name = "id", nullable = false)
    int id;
    @Column(name = "saison")
    String saison;
    @Column(name = "dateDebut")
    @JdbcTypeCode(SqlTypes.DATE)
    Date dateDebut;
    @Column(name = "dateFin")
    @JdbcTypeCode(SqlTypes.DATE)
    Date dateFin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }


    public Saison() {
    }
    public Saison(int id, String saison, Date dateDebut, Date dateFin) {
        this.setId(id);
        this.setSaison(saison);
        this.setDateDebut(dateDebut);
        this.setDateFin(dateFin);
    }
}
