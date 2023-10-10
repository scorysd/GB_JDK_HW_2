package command;

import command.interfaces.Backend;
import command.interfaces.Developer;
import command.interfaces.Fullstack;

public class App {
    public static void main(String[] args) {
        Fullstack petya = new DeveloperFull();
        petya.createGUI();
        petya.createServer();
        Backend vasya = new DeveloperBack();
        vasya.createServer();


        Developer vova = new DeveloperFront();
        if (vova instanceof DeveloperFront) {
            ((DeveloperFront) vova).createGUI();

        }
    }
}
