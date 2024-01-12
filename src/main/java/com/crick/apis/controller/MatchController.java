package com.crick.apis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchServices;

@RestController
@RequestMapping("/match")
public class MatchController {
	
	private MatchServices matchServices;
	
	//constructor injection
	public MatchController(MatchServices matchServices) {
		this.matchServices = matchServices;
	}

	//Get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatch(){
		return new ResponseEntity<>(this.matchServices.getLiveMatches(),HttpStatus.OK);
	}
	
	//get all matches
	@GetMapping("")
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchServices.getAllMatches(),HttpStatus.OK);
		
	}

}
