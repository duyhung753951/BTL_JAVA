package gameState;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public interface Statemethods {
public void update();
public void draw(Graphics g);
public void mouseClicked(MouseEvent e);
public void mousePressed(MouseEvent e);
public void mouseReleased(MouseEvent e);
public void mousedMoved(MouseEvent e);
public void keyPressed(KeyEvent e);
public void keyReleased(KeyEvent e);


}
