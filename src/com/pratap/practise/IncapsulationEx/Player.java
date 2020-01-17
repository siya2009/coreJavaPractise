package com.pratap.practise.IncapsulationEx;

public class Player {
	private String name;
	private int health = 100;
	private String weapon;
	
	
	
	
	public Player(String name, int health, String weapon) {
		this.name = name;
		if (health > 0 && health <= 100) {
			this.health = health;
		}
	  this.weapon = weapon;
	}

	public void looseHealth(int damage) {
		this.health = this.health - damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out");
			// Reduce number of lives remaining for the player.
		}
	}

	public int getHealth() {
		return health;
	}
	
	
}
