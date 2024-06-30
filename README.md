# Magical-Arena

Problem Statement:

Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0
    * Any two player can fight a match in the arena. 
    * Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. 
    * The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. 
    * The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. 
    * Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0
    * Player with lower health attacks first at the start of a match    


## Overview

The project consists of the following components as part of application:
Inside `src/com/java`:
* `Player.java`: Defines the attributes and behavior of a player.
* `Match.java`: Manages the interaction between two players during a match.
* `MagicalArena.java`: Simulates the matches within the arena and the entry point of the application.

As part of testing, we have:
Inside `test/com/java`
* `TestPlayer.java`: Consists unit Tests for Player
* `TestMatch.java`: Consists unit Tests for Match
* `TestMagicalArena.java`: Consists unit Tests for MagicalArena

All the compiled classes goes into `target/com/java`. If this folder doesn't exists, it is created on the go during compilation. 

As part of building we have:
* Makefile

## Pre-Requisites
Following are the dependencies to run the application:
* Java
* make
* After unzipping, cd into the `root directory` of the project: `Magical_Arena`

## Run the application
To run the application with dynamic inputs, run the command `make match` ensuring current working directory as Magical_Arena/
This command will prompt you for the inputs

## Run the Unit Tests
* To test every component/behaviour: run the command `make test_all`, for windows env run `make test_all_win`
* To test Player: run the command `make test_player`, for windows env run `make test_player_win`
* To test Match: run the command `make test_match`, for windows env run `make test_match_win`
* To test MagicalArena: run the command `make test_magicalArena`, for windows env run `make test_magicalArena_win`



