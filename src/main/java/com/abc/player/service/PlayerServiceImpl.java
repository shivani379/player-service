package com.abc.player.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.player.entity.PlayerEntity;
import com.abc.player.exception.PlayerNotFoundException;
import com.abc.player.model.Player;
import com.abc.player.repository.PlayerRepository;
import com.abc.player.util.EntityModelUtil;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerRepository  playerRepository;
	
	@Override
	public Player savePlayer(Player player) 
	{
		PlayerEntity playerEntity = playerRepository.save(EntityModelUtil.playerModelToEntity(player));
		return EntityModelUtil.playerEntityToModel(playerEntity);
	}

	@Override
	public List<Player> getAllPlayer() 
	{
		List<PlayerEntity> playerEntityList = playerRepository.findAll();
		return EntityModelUtil.PlayerEntityToModelList(playerEntityList);
	}

	@Override
	public Player getPlayerById(int playerId) 
	{
		Optional<PlayerEntity> optionalPlayer = playerRepository.findById(playerId);
		if(optionalPlayer.isEmpty())
		{
			throw new PlayerNotFoundException("Sorry! Player is not existing with id :"+playerId);
		}
		return EntityModelUtil.playerEntityToModel(optionalPlayer.get());
	}

	@Override
	public void deletePlayer(int playerId) 
	{
		Optional<PlayerEntity> optional = playerRepository.findById(playerId);
		if(optional.isEmpty())
		{
			throw new PlayerNotFoundException("Sorry! Player is not existing with id :"+playerId);
		}
		playerRepository.deleteById(playerId);
	}

	@Override
	public Player updatePlayer(Player player) 
	{
		Optional<PlayerEntity> optional = playerRepository.findById(player.getPlayerId());
		if(optional.isEmpty())
		{
			throw new PlayerNotFoundException("Sorry! Player is not existing with id :"+player.getPlayerId());
		}
		PlayerEntity playerEntity = playerRepository.save(EntityModelUtil.playerModelToEntity(player));
		return EntityModelUtil.playerEntityToModel(playerEntity);
	}
}
