package bakery.cake;

public interface Cakeable extends Bakeable, Consumable, Iced {

    public String getMessage();

    public default String admire() {
        return "Its a " + this.getClass().getName() + " that has icing with " + getIcing() + "!";
    }
    
}
