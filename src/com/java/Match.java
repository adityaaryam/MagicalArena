package com.java;
import java.util.Random;
public class Match {
    private Player attacker;
    private Player defender;
    private Random dice;
    public Match(Player playerA, Player playerB, Random dice){

        this.attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        this.defender = playerA.getHealth() < playerB.getHealth() ? playerB : playerA;
        this.dice = dice;
    }
    
    public void startMatch(){
        while(attacker.getHealth() > 0 && defender.getHealth() > 0)
        {
            int attacker_multiplier = dice.nextInt(6) + 1;
            int defender_multiplier = dice.nextInt(6) + 1;

            int attacker_damage = attacker_multiplier*attacker.getAttack();
            int defender_defence = defender_multiplier*defender.getStrength();
            int net_damage=attacker_damage-defender_defence;
            defender.setHealth(defender.getHealth() - Math.max(0, net_damage) );

            Player swapper= attacker;
            attacker=defender;
            defender=swapper;
        }
        
    }

}
