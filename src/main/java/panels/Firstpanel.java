package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import example.keylisteners.ArraowKeyListener;

public class Firstpanel extends JPanel implements ActionListener,KeyListener {
	int currX,currY=0;
	JTextField textinput;
	private Timer timer;
	public Firstpanel(JTextField textinput) {
		ArraowKeyListener x1=(ArraowKeyListener)textinput.getKeyListeners()[0];
		this.currX=x1.currentX;
		this.currY=x1.currentY;
		this.textinput=textinput;
		setPreferredSize(new Dimension(100,100));
        // set the game board background color
        setBackground(Color.BLUE);
       timer = new Timer(25, this);
        timer.start();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
    
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	 @Override
	    public void actionPerformed(ActionEvent e) {
		 repaint();
	 }
	   @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.setColor(Color.yellow);
	        ArraowKeyListener x1=(ArraowKeyListener)textinput.getKeyListeners()[0];
			 g.fill3DRect(x1.currentX,x1.currentY,5,5,true);
	 }        
	

}
