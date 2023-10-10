package Chat;

public class Listener implements ChatListener{
    @Override
    public void getMessage(String message) {
        System.out.println("Message: " + message);
    }
}
