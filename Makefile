
path := $(subst $() $(),\ ,$(shell pwd))

match:
	@(make clean)
	@(cd $(path)/src && javac com/java/Player.java)
	@(cd $(path)/src && javac com/java/Match.java)
	@(cd $(path)/src && java com/java/MagicalArena.java)

clean:
	@(rm -rf $(path)/src/com/java/*.class)
	@(rm -rf $(path)/src/com/test/*.class)


