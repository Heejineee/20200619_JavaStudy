import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame implements KeyListener{
	GameView gv=new GameView();
	public GameMain()
	{
		// 생성자 ==> 
		add("Center",gv);
		setSize(1024, 786);
		setVisible(true);
		
		addKeyListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMain gm=new GameMain();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this)
		{
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				gv.y-=5;
				if(gv.y<0)
					gv.y=768;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				gv.y+=5;
				if(gv.y>768)
					gv.y=0;				
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				gv.x-=5;
				if(gv.x<0)
					gv.x=1024;
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				gv.x+=5;
				if(gv.x>1024)
					gv.x=0;
			}
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) // ESC 누르면 게임종료
			{
				System.exit(0);
			}
			gv.repaint();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
