package com.programmer.repo.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.programmer.gate.model.Team;
import com.programmer.gate.repository.TeamRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamRepoTest {
	@Autowired
	TeamRepository teamRepository;

	@Test
	public void saveTeamTest() {
		System.out.println("======================= Spring Bot Test case Hello=================================");
		Team team = new Team();
		team.setName("Lions");
		teamRepository.save(team);
		assertTrue(team.getId()!=null);
	}
}
