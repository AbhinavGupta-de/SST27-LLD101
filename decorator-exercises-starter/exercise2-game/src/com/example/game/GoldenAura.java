package com.example.game;

/**
 * Cosmetic decorator: changes sprite, gives small buffs, and logs an aura message on actions.
 */
public class GoldenAura extends CharacterDecorator
{
	public GoldenAura(Character inner)
	{
		super(inner);
	}

	@Override
	public void move()
	{
		System.out.println("A golden aura shimmers!");
		super.move();
	}

	@Override
	public void attack()
	{
		System.out.println("A golden aura empowers the strike!");
		super.attack();
	}

	@Override
	public int getSpeed()
	{
		return inner.getSpeed() + 1;
	}

	@Override
	public int getDamage()
	{
		return inner.getDamage() + 2;
	}

	@Override
	public String getSprite()
	{
		return "golden_" + inner.getSprite();
	}
}
