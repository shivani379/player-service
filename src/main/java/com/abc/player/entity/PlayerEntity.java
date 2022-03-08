package com.abc.player.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_tbl")
public class PlayerEntity {
    
	@Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="player_id")
	private int playerId;
	
	@Column(name="team_id")
	private int teamId;
	
	@Column(name="player_name")
	private String playerName;
	
	@Column(name="player_DOB")
	private LocalDate playerDOB;
	
	@Column(name="player_role")
	private String playerRole;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public LocalDate getPlayerDOB() {
		return playerDOB;
	}

	public void setPlayerDOB(LocalDate playerDOB) {
		this.playerDOB = playerDOB;
	}

	public String getPlayerRole() {
		return playerRole;
	}

	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}

		
	
}
