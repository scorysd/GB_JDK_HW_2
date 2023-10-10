package Chat;

public class ChatServer {
    private final ServerButtonListener serverButtonListener;
    public boolean ServerOn;
    private final ChatListener listener;
    private final ServerSocketThreadListener serverSocketThreadListener;
    private final SocketThreadListener socketThreadListener;



    public ChatServer(ServerButtonListener serverButtonListener, boolean serverOn, Listener listener, ServerSocketThreadListener serverSocketThreadListener, SocketThreadListener socketThreadListener) {
        this.serverButtonListener = serverButtonListener;
        ServerOn = serverOn;
        this.listener = listener;
        this.serverSocketThreadListener = serverSocketThreadListener;
        this.socketThreadListener = socketThreadListener;
    }

    public void start() {
        serverButtonListener.prsBtn("start");
        if (ServerOn) {
            listener.getMessage("Server already start");
        } else {
            serverSocketThreadListener.onStart();
            listener.getMessage("Server started!");
            ServerOn = true;
        }
    }

    public void stop() {
        serverButtonListener.prsBtn("stop");
        if (ServerOn) {
            listener.getMessage("Server stopped!");
            ServerOn = false;
            serverSocketThreadListener.onStop();
        } else {
            listener.getMessage("Server already stop!");
        }
    }

}
