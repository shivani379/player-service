package com.abc.player.model;

import java.time.LocalDate;

public class Player {
	private int playerId;
	private int team_id;
	private String playerName;
	private LocalDate playerDOB;
	private String playerRole;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
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
