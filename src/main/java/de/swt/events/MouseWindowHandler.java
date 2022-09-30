package de.swt.events;

import de.swt.ui.Drawing;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseWindowHandler extends MouseAdapter {

    public int MouseX, MouseY;
    private int counter = 0;
    public boolean startProgram = false;


    @Override
    public void mouseClicked(MouseEvent evt){
        super.mouseClicked(evt);
        if(evt.getClickCount() == 2) {

            startProgram = true;
            MouseX = evt.getX();
            MouseY = evt.getY();
            Drawing drawArea = (Drawing) evt.getSource();
            if(counter < 2) {
                drawArea.paint(drawArea.getGraphics());
                counter++;
                System.out.println(counter);
            } else {
                drawArea.clear();
                counter = 0;
            }
        }


    }

}
