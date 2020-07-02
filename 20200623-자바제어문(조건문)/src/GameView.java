import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
	Image back,move;
	int x=15,y=15;
	public GameView()
	{
		// 이미지를 가지고 온다
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\bg.jpg");
		move=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\move.jpg");
	}
	// 이미지 출력
	public void paint(Graphics g)
	{
		g.drawImage(back, 0,0,getWidth(),getHeight(),this);
		g.drawImage(move, x,y,80,50,this);
	}
}
