package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {
	

	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	private TeamRepository teamRepository;
	
	public List<String> getAllTeamPlayers(long teamId) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();
		List<Player> players = playerRepository.findByTeamId(teamId);
        for (Player player : players) {
            result.add(player.getName());
        }
		return result;
	}

	public void addBarcelonaPlayer(String name, String position, int number) {
		// TODO Auto-generated method stub
		
		Team barcelona = teamRepository.findById(1l).orElse(null);
        
        

        Player newPlayer = new Player();

        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);

        playerRepository.save(newPlayer);
		
	}

	
}
