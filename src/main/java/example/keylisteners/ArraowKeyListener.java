package example.keylisteners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/*
 * to handle arrow key events
 * */
public class ArraowKeyListener implements KeyListener {
	public int wrongkey,currentX,currentY,currentmoves,moveleft,moveright,moveup,movedown=0;
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		updatePos(e.getKeyCode());
		
	}

	private void updatePos(int keyCode) {
		if(keyCode>=37 && keyCode<=40) {
			currentmoves++;
			switch(keyCode) {
				default:
					break;
				case 37:
					moveleft++;
					currentX--;
					break;
				case 38:
					moveup++;
					currentY++;
					break;
				case 39:
					moveright++;
					currentX++;
					break;
				case 40:
					movedown++;
					currentY--;
					break;
			}
		} else {
			wrongkey++;
			System.out.println("wrong key");
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	}

}
