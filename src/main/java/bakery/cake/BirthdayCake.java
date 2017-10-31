package bakery.cake;

public class BirthdayCake implements Cakeable {
        
    private Icing icing;
    
    public BirthdayCake() {  

    }

    @Override
    public String getMessage() {
        return "Happy Birthday";
    }

    @Override
    public Icing getIcing() {
        return icing;
    }

    @Override
    public void setIcing(Icing icing) {
        this.icing = icing;
    }
    
    @Override
    public int getBakeTime() {
        return 5;
    }
}
