package bakery.cake.factory;

import static org.junit.Assert.*;
import org.junit.Test;

import bakery.cake.CakeTheme;
import bakery.cake.Cakeable;

public class CakeFactoryTest {

    @Test
    public void testBakeBirthdayCake() 
        throws UnknownCakeException {
        Cakeable cake = CakeFactory.bakeCake(CakeTheme.Birthday, "Test Guy");      
        assertNotNull(cake);
        assertNotNull(cake.getIcing());
        assertEquals(cake.getIcing().getMessage(), "Happy Birthday Test Guy!");
    }
    

    @Test
    public void testBakeGraduationCake() 
        throws UnknownCakeException {
        Cakeable cake = CakeFactory.bakeCake(CakeTheme.Graduation, "Test Guy");      
        assertNotNull(cake);
        assertNotNull(cake.getIcing());
        assertEquals(cake.getIcing().getMessage(), "Congratulations Test Guy!");
    }
    

    @Test(expected = UnknownCakeException.class)
    public void testBakeUnknownCake() 
        throws UnknownCakeException {
        Cakeable cake = CakeFactory.bakeCake(CakeTheme.Wedding, "Test Guy"); 
    }
    
}
