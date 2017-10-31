package bakery.cake.factory;

import bakery.cake.Cakeable;
import bakery.cake.CakeTheme;
import bakery.cake.Icing;

import java.util.function.BiFunction;

import bakery.cake.BirthdayCake;
import bakery.cake.GraduationCake;

public class CakeFactory {


    private static BiFunction<String, String, String> messageCustomizer =
        (baseMessage, personalization) -> String.join(" ", baseMessage, personalization);
        
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
                
                String birthdayMessage = messageCustomizer.apply(cake.getMessage(), recipient);
                   
                birthdayIcing.setMessage(birthdayMessage);

                birthdayIcing.exciteMessage();
                
                cake.setIcing(birthdayIcing);
                
                break;
            case Graduation :
                cake = new GraduationCake();

                // First bake cake
                cake.bake();
                
                // Baking done, time to ice
                Icing graduationIcing = new Icing();
                graduationIcing.setColor("Black");

                String graduationMessage = messageCustomizer.apply(cake.getMessage(), recipient);
                
                graduationIcing.setMessage(graduationMessage);
                
                graduationIcing.exciteMessage();
                
                cake.setIcing(graduationIcing);
                
                break;
            default:
                throw new UnknownCakeException("We can't make that cake!");
        }
        
        return cake;
        
    }
    
}
