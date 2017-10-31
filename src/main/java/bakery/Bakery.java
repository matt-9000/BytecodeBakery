package bakery;

import java.util.Scanner;

import bakery.cake.CakeTheme;
import bakery.cake.Cakeable;
import bakery.cake.factory.CakeFactory;
import bakery.cake.factory.UnknownCakeException;

public class Bakery {

    public static void main(String[] args) {

        System.out.println("Welcome to the Java Bakery!");
        System.out.println("~~~~~~");
        
        try(Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter cake recipient's name: ");
            String name = scanner.nextLine();
            
            CakeTheme cakeTheme = CakeTheme.Wedding;
            boolean needCakeType = true;
            while(needCakeType) {
                System.out.print("Enter cake type (Graduation = 1, Birthday = 2): ");

                String cakeTypeString = scanner.nextLine();

                int cakeTypeInt = 0;
                try {
                    cakeTypeInt = Integer.parseInt(cakeTypeString);
                } catch (NumberFormatException e) {
                    // 
                }
                
                if (cakeTypeInt > 0 && cakeTypeInt < 3) {
                    needCakeType = false;
                    
                    if(cakeTypeInt == 1) {
                        cakeTheme = CakeTheme.Graduation;
                    } else if (cakeTypeInt == 2) {
                        cakeTheme = CakeTheme.Birthday;
                    }
                    
                } else {
                    System.out.println("Invalid selection! Try again...");
                }
            }
            
            try {
                Cakeable cake = CakeFactory.bakeCake(cakeTheme, name);

                System.out.println();
                System.out.println("Your cake is now ready, admire it!");
                System.out.println(cake.admire());
                System.out.println();
            } catch (UnknownCakeException e) {
                System.out.println();
                System.out.println(":( :( :(");
                System.out.println("CakeFactory had a problem: " + e.getMessage());
                System.out.println(":( :( :(");
                System.out.println();
            }
            
        }

        System.out.println("~~~~~~");
        System.out.println("Thanks for visiting, the bakery is now closed!");
        
    }
}
