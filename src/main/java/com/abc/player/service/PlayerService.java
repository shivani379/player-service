package com.abc.player.service;

import java.util.List;

import com.abc.player.model.Player;

public interface PlayerService {
	
public Player savePlayer(Player player);
	
	public List<Player> getAllPlayer();
	
	public Player getPlayerById(int playerid);
	
	public void deletePlayer(int playerid);
	
	public Player updatePlayer(Player player);

}
