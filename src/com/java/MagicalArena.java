package com.java;
import java.util.Random;

public class MagicalArena {
    public static String post_process_result(Player playerA, Player playerB){
        return (playerA.getHealth()<=0 ? "player B" : "player A")+" won the match";
    }
    public static void main(String[] args) {
        Random dice = new Random();
        try {
            Player playerA= new Player(100, 20, 10);
            Player playerB= new Player(50, 10, 20);
            Match match=new Match(playerA, playerB, dice);
            match.startMatch();
            System.out.println(post_process_result(playerA, playerB));

        } catch (InvalidAttributeException exception) {
            System.err.println("Invalid Attribute passed: "+exception);
            System.exit(-1);
        }
        
    }
}
