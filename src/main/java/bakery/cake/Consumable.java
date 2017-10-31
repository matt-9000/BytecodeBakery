package bakery.cake;

public interface Consumable {

    public default String consume() {
        return "You ate it. Yum!";
    }
}
