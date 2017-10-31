package bakery.cake;

public class GraduationCake implements Cakeable {
    
    private Icing icing;
    
    public GraduationCake() {  

    }

    @Override
    public String getMessage() {
        return "Congratulations";
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
        return 6;
    }
}
