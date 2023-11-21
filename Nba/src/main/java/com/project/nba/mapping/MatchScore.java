package com.project.nba.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

public class MatchScore {
    @Id
    @Column(name = "id", nullable = false)
    int id;
    @ManyToOne
    @JoinColumn(name = "match", referencedColumnName = "id")
    Match match;

    @Column(name = "score1")
    @JdbcTypeCode(SqlTypes.INTEGER)
    int score1;
    @Column(name = "score2")
    @JdbcTypeCode(SqlTypes.INTEGER)
    int score2;

//    Encapsulation
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

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

//    Constructors

    public MatchScore() {
    }

    public MatchScore(int id, Match match, int score1, int score2) {
        this.setId(id);
        this.setMatch(match);
        this.setScore1(score1);
        this.setScore2(score2);
    }
}
