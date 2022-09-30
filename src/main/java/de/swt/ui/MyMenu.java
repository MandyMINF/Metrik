package de.swt.ui;

import java.awt.*;

public class MyMenu extends MenuBar{

    private Menu mainMenu;
    private MenuItem item = new MenuItem("Backgound");

    public MyMenu () {
        super();
        mainMenu = new Menu("Metrik");
        mainMenu.addSeparator();
        mainMenu.add(item);
        add(mainMenu);
    }

}
