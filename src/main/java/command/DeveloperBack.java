package command;

import command.interfaces.Backend;

public class DeveloperBack implements Backend {
    @Override
    public void createServer() {
        System.out.println("drop server");
    }

}
