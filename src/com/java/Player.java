package com.java;

// interface for Player Details
interface GetPlayerDetails{
    public int getHealth();
    public int getStrength();
    public int getAttack();
}
interface SetPlayerDetails{
    public void setHealth(int health);
    public void setStrength(int strength);
    public void setAttack(int attack);
}

// Exception class for any invalid attribute
// class Exception extends Exception{    
//     public Exception(String attribute)
//     {
//         super("Initial "+attribute+" must be positive");
//     }
// }

public class Player implements GetPlayerDetails, SetPlayerDetails {
    private int health;
    private int attack;
    private int strength;

    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getAttack(){
        return this.attack;
    }

    /*  Added setter for Strength and Attack to easily extend the code 
    for new features, like a bonus_attack or bonus_strength in future */
    public void setStrength(int strength){
        this.strength=strength;
    }
    public void setAttack(int attack){
        this.attack=attack;
    }

    // Parametrized Constructor
    public Player(int health, int attack, int strength) throws Exception{
        if(health<=0){
            throw new Exception("health");
        }
        if(attack<=0){
            throw new Exception("attack");
        }
        if(strength<=0){
            throw new Exception("strength");
        }
        this.health=health;
        this.attack=attack;
        this.strength=strength;

    }
}
