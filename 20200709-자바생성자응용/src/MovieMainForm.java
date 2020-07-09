import javax.swing.*;	// ������ ���� Ŭ����
import java.awt.*;		// ���̾ƿ�(ȭ�� ��ġ)
import java.awt.event.*;	//��ư, �ؽ�Ʈ�� ���� => ����(�̺�Ʈ)
// �ڹٿ��� �����ϴ� �������� ��� ����� ����Ѵ�
// �ڹٿ��� ����� �Ѱ��� ���� (���ϻ��)
public class MovieMainForm extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("ã��");
	JMenuItem exit=new JMenuItem("����");
	// ���� => �����츦 �����ش� => ������
	CardLayout card=new CardLayout();	// ȭ�� ��ȯ�Ϸ��� ���°�(�ڿ��� ������� ��û�ø��� ��ġ �����ϴ°�)
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	MovieMainForm() {
		// �޴� ����
		JMenu menu=new JMenu("�޴�");
		menu.add(home);
		menu.add(find);
		menu.addSeparator();	// ���м� �������
		menu.add(exit);
		bar.add(menu);
		
		// �����쿡 ����
		setJMenuBar(bar);
		//���̾ƿ� ����
		setLayout(card);
		add("ML",ml);
		add("MF",mf);
		add("MD",md);
		// ������ ũ�� ����
		setSize(1300,1000);
		// ������ �����ֱ�
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();	// ������ ȣ��ÿ� new �ݵ��!

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
	}

}
