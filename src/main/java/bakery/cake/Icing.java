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
    
    public void exciteMessage() {
        if(this.message != null && !this.message.endsWith("!")) {
            
            if(this.message.endsWith(".")) {
                this.message = this.message.substring(0, this.message.length() - 1);
            }
           
            this.message += "!";
        }
    }

    @Override
    public String toString() {
        return "icing message=\"" + message + "\", and icing color=" + color;
    }
    
}
