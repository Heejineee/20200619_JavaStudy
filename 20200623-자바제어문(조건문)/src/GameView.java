import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
	Image back,move;
	int x=15,y=15;
	public GameView()
	{
		// �̹����� ������ �´�
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\bg.jpg");
		move=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\move.jpg");
	}
	// �̹��� ���
	public void paint(Graphics g)
	{
		g.drawImage(back, 0,0,getWidth(),getHeight(),this);
		g.drawImage(move, x,y,80,50,this);
	}
}
