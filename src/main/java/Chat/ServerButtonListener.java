package Chat;

public class ServerButtonListener implements SocketThreadListener{
    @Override
    public void prsBtn(String btnName) {
        System.out.println("Server log: command received: " + btnName);
    }
}
