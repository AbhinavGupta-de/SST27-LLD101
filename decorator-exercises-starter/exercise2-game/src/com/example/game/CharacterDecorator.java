package com.example.game;

/**
 * Base decorator that implements Character and delegates to an inner Character.
 * Concrete decorators override getters and/or action methods to change behavior.
 */
public class CharacterDecorator implements Character
{
	protected final Character inner;

	public CharacterDecorator(Character inner)
	{
		this.inner = inner;
	}

	@Override
	public void move()
	{
		System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
	}

	@Override
	public void attack()
	{
		System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
	}

	@Override
	public int getSpeed()
	{
		return inner.getSpeed();
	}

	@Override
	public int getDamage()
	{
		return inner.getDamage();
	}

	@Override
	public String getSprite()
	{
		return inner.getSprite();
	}
}
