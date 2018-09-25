package com.programmer.gate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.programmer.gate.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	Team findByPlayers(long playerId);

	@Query("select tm from Team tm where lower(tm.name)=lower(:teamName)")
	Team findByTeamName(@Param("teamName") String teamName);

	@Query("select t from Team t")
	List<Team> getAll();
}
