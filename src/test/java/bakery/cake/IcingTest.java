package bakery.cake;

import static org.junit.Assert.*;
import org.junit.Test;

import bakery.cake.factory.CakeFactory;
import bakery.cake.factory.UnknownCakeException;

public class IcingTest {

    @Test
    public void testIcing() {
        Icing icing = new Icing();  
        
        icing.setColor("Greige");
        assertEquals(icing.getColor(), "Greige");
        
        icing.setMessage("Adequate Festivus.");
        assertEquals(icing.getMessage(), "Adequate Festivus.");
        assertEquals(icing.toString(), "icing message=\"Adequate Festivus.\", and icing color=Greige");

        icing.exciteMessage();
        assertEquals(icing.getMessage(), "Adequate Festivus!");
    }
    
}
