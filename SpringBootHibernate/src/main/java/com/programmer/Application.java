package com.programmer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programmer.gate.model.Player;
import com.programmer.gate.model.Team;

@SpringBootApplication
public class Application implements CommandLineRunner {

	/*@Autowired
	SoccerService soccerService;

	@Autowired
	PlayerRepository playerRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		/*Player player = playerRepository.findOne(new Long(50));
		System.out.println(player.getTeam());
		System.out.println(player);*/
		// soccerService.addPlayer("Srikanth", "First", 10, "Fifa");

		
		 /* List<Team> teams = soccerService.getAllTeams();
		  
		  System.out.println(teams);*/
		 

		/*
		 * Team team = buildTeam(); soccerService.saveTeam(team);
		 */
	}

	private Team buildTeam() {
		Team team = new Team();
		team.setName("INDIA");
		Player player = new Player();
		player.setName("Sachin");
		player.setNum(10);
		player.setPosition("Third");
		player.setTeam(team);
		List<Player> players = new ArrayList<>();
		players.add(player);
		team.setPlayers(players);
		return team;
	}

}