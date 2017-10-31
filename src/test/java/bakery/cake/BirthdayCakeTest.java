package bakery.cake;

import static org.junit.Assert.*;
import org.junit.Test;

public class BirthdayCakeTest {
    
    @Test
    public void testCake() {
        BirthdayCake cake = new BirthdayCake();      
        assertEquals(cake.getMessage(), "Happy Birthday");
    }
}
