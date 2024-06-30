package com.java;
import java.util.Random;
public class Match {
    private Player attacker;
    private Player defender;
    private Random dice;
    private boolean playerA_att_first=true;
    public Match(Player playerA, Player playerB, Random dice){
        if(playerA.getHealth() < playerB.getHealth()){
            this.attacker=playerA;
            this.defender=playerB;
            
        } else{
            this.attacker=playerB;
            this.defender=playerA;
            this.playerA_att_first=false;
        }
        this.dice = dice;
    }
    
    public void startMatch(){
        if (playerA_att_first){
            System.out.println("Player A attacks first");
        } else{
            System.out.println("Player B attacks first");
        }
        int round=1;
        System.out.println("Round \tPlayer A Dice \tPlayer B Dice \tPlayer A Health\t Player B Health");
        while(attacker.getHealth() > 0 && defender.getHealth() > 0)
        {
            int attacker_multiplier = dice.nextInt(6) + 1;
            int defender_multiplier = dice.nextInt(6) + 1;

            int attacker_damage = attacker_multiplier*attacker.getAttack();
            int defender_defence = defender_multiplier*defender.getStrength();
            int net_damage=attacker_damage-defender_defence;
            defender.setHealth(Math.max(0,defender.getHealth() - Math.max(0, net_damage)));

            Player swapper= attacker;
            attacker=defender;
            defender=swapper;
            if(playerA_att_first ^ ((round%2)==1)){
                System.out.println(round+"\t\t"+attacker_multiplier+"\t\t"+defender_multiplier+"\t\t"+this.attacker.getHealth()+"\t\t"+this.defender.getHealth());
            } else{
                System.out.println(round+"\t\t"+defender_multiplier+"\t\t"+attacker_multiplier+"\t\t"+this.defender.getHealth()+"\t\t"+this.attacker.getHealth());
            }
            round++;
        }
        
    }

}
