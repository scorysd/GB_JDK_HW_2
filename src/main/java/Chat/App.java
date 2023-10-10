package Chat;

public class App {
    public static void main(String[] args) {

        ChatServer server = new ChatServer(new ServerButtonListener(), false, new Listener(), new ServerSocketListener(), new SocketListener());
        new ServerWindows(new SocketListener(), server);
    }
}
