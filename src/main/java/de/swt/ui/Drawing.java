package de.swt.ui;

import de.swt.events.MouseWindowHandler;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Drawing extends Canvas {

    private final MouseWindowHandler _mousehandler = new MouseWindowHandler();

    public Drawing() {
        addMouseListener(_mousehandler);
    }

    public void clear(){
        getGraphics().clearRect(0,0,500,300);
    }

    @Override
    public void paint(Graphics g) {
        Rectangle2D rectangle;
        rectangle = new Rectangle2D.Float(
                _mousehandler.MouseX, _mousehandler.MouseY, //Koordinaten
                10.0F, 10.0F); //Size
        Graphics2D g2d = (Graphics2D)g;
        if (_mousehandler.startProgram) {
            g2d.draw(rectangle);
        }
    }
}
