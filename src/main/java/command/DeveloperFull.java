package command;

import command.interfaces.Fullstack;

public class DeveloperFull implements Fullstack {

    @Override
    public void createServer() {
        System.out.println("create server");
    }

    @Override
    public void createGUI() {
        System.out.println("create GUI");
    }
}
