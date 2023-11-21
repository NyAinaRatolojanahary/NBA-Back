package com.project.nba.repository;

import com.project.nba.mapping.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}