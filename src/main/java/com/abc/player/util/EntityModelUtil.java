package com.abc.player.util;

import java.util.ArrayList;
import java.util.List;

import com.abc.player.entity.PlayerEntity;
import com.abc.player.model.Player;

public class EntityModelUtil {
	
	public static PlayerEntity playerModelToEntity(Player player)
	{
		PlayerEntity playerEntity = new PlayerEntity();
		
		playerEntity.setPlayerId(player.getPlayerId());
		playerEntity.setPlayerName(player.getPlayerName());
		playerEntity.setPlayerDOB(player.getPlayerDOB());
		playerEntity.setPlayerRole(player.getPlayerRole());
		playerEntity.setTeamId(player.getTeam_id());
		
		return playerEntity;
	}
	
	public static Player playerEntityToModel(PlayerEntity playerEntity)
	{
	  Player player = new Player();
		
	  player.setPlayerId(playerEntity.getPlayerId());
		player.setPlayerName(playerEntity.getPlayerName());
		player.setPlayerDOB(playerEntity.getPlayerDOB());
		player.setPlayerRole(playerEntity.getPlayerRole());
		player.setTeam_id(playerEntity.getTeamId());
		
		return player;
	}
	
	public static List<Player> PlayerEntityToModelList(List<PlayerEntity> entityList)
	{
		List<Player> playerList = new ArrayList<>();
		
		entityList.forEach(entity -> {
		
				Player player = new Player();
				player.setPlayerId(entity.getPlayerId());
				player.setPlayerName(entity.getPlayerName());
				player.setPlayerDOB(entity.getPlayerDOB());
				player.setPlayerRole(entity.getPlayerRole());
				player.setTeam_id(entity.getTeamId());
				
				
				playerList.add(player);
		});
		return playerList;
	}


}
