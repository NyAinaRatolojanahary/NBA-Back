package com.project.nba.mapping;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
public class Action {
    @Id
    @Column(name = "id", nullable = false)
    int id;

    @ManyToOne
    @JoinColumn(name = "match", referencedColumnName = "id")
    Match match;

    @ManyToOne
    @JoinColumn(name = "joueur", referencedColumnName = "id")
    Joueur joueur;

    @Column(name = "ppm")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    double ppm;
    @Column(name = "rpm")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    double rpm;
    @Column(name = "pdpm")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    double pdpm;
    @Column(name = "mpm")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    double mpm;
    @Column(name = "eff")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    double eff;
    @Column(name = "threepoint")
    @JdbcTypeCode(SqlTypes.DOUBLE)
    double threepoint;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public double getPpm() {
        return ppm;
    }

    public void setPpm(double ppm) {
        this.ppm = ppm;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public double getPdpm() {
        return pdpm;
    }

    public void setPdpm(double pdpm) {
        this.pdpm = pdpm;
    }

    public double getMpm() {
        return mpm;
    }

    public void setMpm(double mpm) {
        this.mpm = mpm;
    }

    public double getEff() {
        return eff;
    }

    public void setEff(double eff) {
        this.eff = eff;
    }

    public double getThreepoint() {
        return threepoint;
    }

    public void setThreepoint(double threepoint) {
        this.threepoint = threepoint;
    }


//    Constructors

    public Action() {
    }

    public Action(int id, Match match, Joueur joueur, double ppm, double rpm, double pdpm, double mpm, double eff, double threepoint) {
        this.setId(id);
        this.setMatch(match);
        this.setJoueur(joueur);
        this.setPpm(ppm);
        this.setRpm(rpm);
        this.setPdpm(pdpm);
        this.setMpm(mpm);
        this.setEff(eff);
        this.setThreepoint(threepoint);
    }
}
