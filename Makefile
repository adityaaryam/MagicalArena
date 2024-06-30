
path := $(subst $() $(),\ ,$(shell pwd))

dependencies:
	@make clean
	@cd $(path)/src && javac com/java/Player.java
	@cd $(path)/src && javac com/java/Match.java
	@javac -d target src/com/java/*.java

match:
	@make dependencies
	@cd $(path)/src && java com/java/MagicalArena.java

test_player:
	@make dependencies
	@javac -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" -d target test/com/java/TestPlayer.java
	@java -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.java.TestPlayer

test_match:
	@make dependencies
	@javac -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" -d target test/com/java/TestMatch.java
	@java -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.java.TestMatch

test_magicalArena:
	@make dependencies
	@javac -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" -d target test/com/java/TestMagicalArena.java
	@java -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.java.TestMagicalArena

test_all:
	@make dependencies
	@javac -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" -d target test/com/java/*.java
	@java -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.java.TestPlayer
	@java -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.java.TestMatch
	@java -cp "target;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.java.TestMagicalArena

clean:
	@(rm -rf $(path)/src/com/java/*.class)
	@(rm -rf $(path)/src/com/test/*.class)
	@(rm -rf $(path)/target/com/java/*.class)


