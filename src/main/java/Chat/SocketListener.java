package Chat;

public class SocketListener implements SocketThreadListener{
    @Override
    public void prsBtn( String btnName) {
        System.out.println("Client log: pressed button - " + btnName);

    }
}
