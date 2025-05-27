package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import example.keylisteners.ArraowKeyListener;
import panels.Firstpanel;

public class StartClass {
	public static void main(String[] args) {

		JFrame mainPage=new JFrame("testing keyhandler");
		mainPage.setLayout(new GridLayout(3, 3,3,3));
		JTextField textinput=new JTextField();
		textinput.addKeyListener(new ArraowKeyListener());
		textinput.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				ArraowKeyListener x1=(ArraowKeyListener)textinput.getKeyListeners()[0];
				textinput.setText(x1.currentX+","+x1.currentY+","+x1.wrongkey);			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		mainPage.add(textinput);
		JButton endButton=new JButton("exit");
		endButton.setSize(10, 10);
		
		endButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArraowKeyListener x1=(ArraowKeyListener)textinput.getKeyListeners()[0];
				System.out.println(x1.currentX +","+x1.currentY+","+x1.currentmoves);
				textinput.setText(textinput.getText()+"\n"+x1.currentX +","+x1.currentY+","+x1.currentmoves);
				textinput.repaint();
				System.out.println("wrong-"+x1.wrongkey);
				mainPage.dispose();
				System.exit(0);
				System.gc();
			}
		});
		mainPage.add(endButton);
		
		Firstpanel firstPanel=new Firstpanel(textinput);
		mainPage.add(firstPanel);
		//mainPage.addKeyListener(firstPanel);
		mainPage.setSize(200, 200);
		mainPage.setVisible(true);

	
	}

}
