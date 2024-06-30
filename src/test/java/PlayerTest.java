package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.java.Player;

public class PlayerTest {
    @Test
	    public void testPlayerCreation() {
		
            try {
                Player player = new Player(100, 10, 5);
	        
                assertEquals(100, player.getHealth());
                assertEquals(10, player.getStrength());
                assertEquals(5, player.getAttack());
            } catch (InvalidAttributeException e) {
                assertE
            }
	        
	        
	    }   
}
