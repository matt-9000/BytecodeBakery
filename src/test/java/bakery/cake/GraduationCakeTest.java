package bakery.cake;

import static org.junit.Assert.*;
import org.junit.Test;

import bakery.cake.factory.CakeFactory;
import bakery.cake.factory.UnknownCakeException;

public class GraduationCakeTest {

    @Test
    public void testCake() {
        GraduationCake cake = new GraduationCake();      
        assertEquals(cake.getMessage(), "Congratulations");
    }
    
}
