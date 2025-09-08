package com.example.game;

/**
 * Adds bonus damage and updates attack printout.
 */
public class DamageBoost extends CharacterDecorator
{
	private final int bonus;

	public DamageBoost(Character inner, int bonus)
	{
		super(inner);
		this.bonus = bonus;
	}

	@Override
	public void attack()
	{
		System.out.println("Attacking stronger! Damage: " + getDamage() + " using sprite " + getSprite());
	}

	@Override
	public int getDamage()
	{
		return inner.getDamage() + bonus;
	}
}
