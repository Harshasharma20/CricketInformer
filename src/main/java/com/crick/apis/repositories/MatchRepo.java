package com.crick.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crick.apis.entities.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match, Integer> {
	//match fetch krna chahti hu
	//provide kr do ---> teamHeading
	
	//Every Java Programmer is familiar with 
	//NullPointerException. It can crash your 
	//code. And it is very hard to avoid it 
	//without using too many null checks. So, 
	//to overcome this, Java 8 has introduced 
	//a new class Optional in java.util package.
	//It can help in writing a neat code without using too many null checks. By using Optional, we can specify alternate values to return or alternate code to run. This makes the code more readable because the facts which were hidden are now visible to the developer.
	Optional<Match> findByTeamHeading(String teamHeading);
	
}
