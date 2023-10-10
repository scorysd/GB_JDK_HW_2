package command;

import command.interfaces.Frontend;

public class DeveloperFront implements Frontend {
    @Override
    public void createGUI() {
        System.out.println("create GUI");
    }
}
