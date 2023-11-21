package com.project.nba.service;

import com.project.nba.mapping.Match;
import com.project.nba.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    MatchRepository matchRepository;

    @Autowired
    public  MatchService(MatchRepository matchRepository){
        this.matchRepository = matchRepository;
    }

    public List<Match> getAllMatch(){
        return matchRepository.findAll();
    }


}
