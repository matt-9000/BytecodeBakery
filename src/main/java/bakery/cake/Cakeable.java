package bakery.cake;

public interface Cakeable extends Admirable, Bakeable, Consumable, Iced {

    public String getMessage();

    @Override
    public default String admire() {
        return "Its a " + this.getClass().getName() + " that has icing with " + getIcing() + "!";
    }
    
}
