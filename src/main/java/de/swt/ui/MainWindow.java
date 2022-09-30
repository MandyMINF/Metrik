package de.swt.ui;

import de.swt.events.MainWindowHandler;
import java.awt.*;

public class MainWindow extends Frame {

        public MainWindow(){
            setSize(500,300);
            setTitle("Metrik Version 1.0");
            createWindow();
        }

        public void createWindow() {
            add(drawArea);
            //add(mymenu);
        }

        public void showFrame(){
            this.setVisible(true);
        }

        public void setHandler(MainWindowHandler mainWindowHandler) {
            addWindowListener(mainWindowHandler);
         }
}
