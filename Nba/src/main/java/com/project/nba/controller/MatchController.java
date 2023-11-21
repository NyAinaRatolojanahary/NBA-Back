package com.project.nba.controller;

import com.project.nba.mapping.Match;
import com.project.nba.repository.MatchRepository;
import com.project.nba.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class MatchController {
    MatchService matchService;

    @Autowired
    public MatchController (MatchService matchService){
        this.matchService = matchService;
    }

    @PostMapping("/listMatch")
    public ResponseEntity<List<Match>> getAllMatch(){
        List<Match> match = matchService.getAllMatch();
        return  new ResponseEntity<>(match, HttpStatus.OK);
    }



}
