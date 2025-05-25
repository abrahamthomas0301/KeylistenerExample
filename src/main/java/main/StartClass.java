package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import example.keylisteners.ArraowKeyListener;

public class StartClass {

	public static void main(String[] args) {
		JFrame mainPage=new JFrame("testing keyhandler");
		mainPage.setLayout(new GridLayout(3, 3,3,3));
		JTextField textinput=new JTextField();
		textinput.addKeyListener(new ArraowKeyListener());
		mainPage.add(textinput);
		JButton endButton=new JButton("exit");
		endButton.setSize(10, 10);
		ArraowKeyListener x1=(ArraowKeyListener)textinput.getKeyListeners()[0];
		
		
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
		mainPage.setSize(200, 200);
		mainPage.setVisible(true);

	}

}
