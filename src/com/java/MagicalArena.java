package com.java;
import java.util.Random;
import java.util.Scanner;

public class MagicalArena {
    public static String post_process_result(Player playerA, Player playerB){
        return (playerA.getHealth()<=0 ? "player B" : "player A")+" won the match";
    }
    public static void main(String[] args) {
        Random dice = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input PlayerA Health, Strength, Attack: ");
        int playerA_health=scanner.nextInt();
        int playerA_strength=scanner.nextInt();
        int playerA_attack=scanner.nextInt();
        System.out.print("Input PlayerB Health, Strength, Attack: ");
        int playerB_health=scanner.nextInt();
        int playerB_strength=scanner.nextInt();
        int playerB_attack=scanner.nextInt();
        scanner.close();
        try {
            Player playerA= new Player(playerA_health, playerA_attack, playerA_strength);
            Player playerB= new Player(playerB_health, playerB_attack, playerB_strength);
            Match match=new Match(playerA, playerB, dice);
            match.startMatch();
            System.out.println(post_process_result(playerA, playerB));

        } catch (Exception exception) {
            System.err.println("Invalid Attribute passed: "+exception);
            System.exit(-1);
        }
        
    }
}
