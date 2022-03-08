package com.abc.player.exception;

public class PlayerNotFoundException extends RuntimeException {
	public PlayerNotFoundException(String erroMsg)
	{
		super(erroMsg);
	}

}
