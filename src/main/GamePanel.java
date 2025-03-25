package main;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;


public class GamePanel extends JPanel{
	
	private MouseInputs mouseInputs;
	private Game game;
	
	public GamePanel(Game game) {
		
		mouseInputs = new MouseInputs(this);
		this.game = game;
		
		setPanelSize();
		addKeyListener(new KeyBoardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}
	
	

	private void setPanelSize() {
		Dimension size = new Dimension(1280,720);
		setPreferredSize(size);
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		game.render(g);
		
	}

	public void updateGame() {
		
		
		
	}
	
	public Game getGame() {
		return game;
	}
	
}

