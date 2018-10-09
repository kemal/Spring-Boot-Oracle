package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Player;
import com.example.demo.service.SoccerService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	SoccerService soccerService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}


	@Override
	public void run(String... args) throws Exception {
		
        soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);

        List<String> players = soccerService.getAllTeamPlayers(1);

        for(String player : players)

        {

            System.out.println("Introducing Barca player => " + player);

        }
		
	}
	
	

	
	

}
