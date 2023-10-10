package Chat;

public class ServerSocketListener implements ServerSocketThreadListener{
    @Override
    public void onStart() {
        System.out.println("LOG: Server started");
    }

    @Override
    public void onStop() {
        System.out.println("LOG: Server stopped");
    }
}
