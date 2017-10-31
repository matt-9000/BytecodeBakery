package bakery.cake;

public class Icing {

    private String message;
    private String color;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "message=\"" + message + "\", and color=" + color;
    }
    
}
