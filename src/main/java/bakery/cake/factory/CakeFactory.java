package bakery.cake.factory;

import bakery.cake.Cakeable;
import bakery.cake.CakeTheme;
import bakery.cake.Icing;
import bakery.cake.BirthdayCake;
import bakery.cake.GraduationCake;

public class CakeFactory {

    public static Cakeable bakeCake(CakeTheme theme, String recipient) throws UnknownCakeException {
        
        Cakeable cake = null;
        
        switch (theme) {
            case Birthday :
                cake = new BirthdayCake();
                
                // First bake cake
                cake.bake();
                
                // Baking done, time to ice
                Icing birthdayIcing = new Icing();
                birthdayIcing.setColor("Blue");
                
                String birthdayMessage = cake.getMessage() + " " + recipient + "!";
                birthdayIcing.setMessage(birthdayMessage);
                
                cake.setIcing(birthdayIcing);
                
                break;
            case Graduation :
                cake = new GraduationCake();

                // First bake cake
                cake.bake();
                
                // Baking done, time to ice
                Icing graduationIcing = new Icing();
                graduationIcing.setColor("Black");

                String graduationMessage = cake.getMessage() + " " + recipient + "!";
                graduationIcing.setMessage(graduationMessage);
                
                cake.setIcing(graduationIcing);
                
                break;
            default:
                throw new UnknownCakeException("We can't make that cake!");
        }
        
        return cake;
        
    }
    
}
