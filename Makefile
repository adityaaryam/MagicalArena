
path= $(subst $() $(),\ ,$(shell pwd))

match:
	@cd $(path)/src && javac com/java/Player.java
	@cd $(path)/src && javac com/java/Match.java
	@cd $(path)/src && java com/java/MagicalArena.java
	@make clean

clean:
	@rm -rf $(path)/src/com/java/*.class
	@rm -rf $(path)/src/com/test/*.class


