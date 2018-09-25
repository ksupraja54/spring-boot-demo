package com.programmer.gate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.gate.model.Player;
import com.programmer.gate.model.Team;
import com.programmer.gate.repository.PlayerRepository;
import com.programmer.gate.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {

	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	private TeamRepository teamRepository;

	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result = new ArrayList<String>();
		List<Player> players = playerRepository.findByTeamId(teamId);
		for (Player player : players) {
			result.add(player.getName());
		}

		return result;
	}

	public void addPlayer(String name, String position, int number, String teamName) {

		Team team = teamRepository.findByTeamName(teamName);
		Player newPlayer = new Player();
		newPlayer.setName(name);
		newPlayer.setPosition(position);
		newPlayer.setNum(number);
		newPlayer.setTeam(team);
		playerRepository.save(newPlayer);
	}

	@Override
	public void addTeam(String name) {
		Team team = new Team();
		team.setName(name);
		teamRepository.save(team);
	}

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.getAll();
	}

	@Override
	public Team findByTeamName(String teamName) {
		return teamRepository.findByTeamName(teamName);
	}

	@Override
	public void saveTeam(Team team) {
		teamRepository.save(team);

	}

}
