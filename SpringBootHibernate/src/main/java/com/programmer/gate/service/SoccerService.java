package com.programmer.gate.service;

import java.util.List;

import com.programmer.gate.model.Team;

public interface SoccerService {
	public List<String> getAllTeamPlayers(long teamId);
	public void addPlayer(String name, String position, int number, String teamName);
	void addTeam(String name);
	Team findByTeamName(String teamName);
	List<Team> getAllTeams();
	void saveTeam(Team team );
}
