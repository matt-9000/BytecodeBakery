package bakery.cake;

public interface Bakeable {

    public int getBakeTime();
    
    public default void bake() {
        System.out.print("Baking");
        
        for(int i = 0; i < getBakeTime(); i++) {

            System.out.print(".");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error sleeping!");
                e.printStackTrace();
            }

        }
        System.out.println();
        System.out.println("Ding! Baking done.");
    }
    
}
