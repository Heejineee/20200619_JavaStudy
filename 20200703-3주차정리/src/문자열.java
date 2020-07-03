/*
 * 	
 * 	�⺻�� => ����, �Ǽ�, ��, ����
 * 	������ => ���� ���� ��� �ٸ����� ���� (�ּҿ� ����)
 * 	
 * 	���ڿ� => �����ϴ� ���� (String)
 * 		1) ���� ���
 * 			String s="��������"; ==> ���� �󤷵�
 * 			String s=new String("")
 * 		2) �ֿ� ���
 * 			���ڸ� ������ �� �ִ� ���(�޼ҵ�) => ���̺귯�� �ٽ�
 * 			- length() : ���� ����
 * 			- substring() : ���ڸ� �ڸ� ��
 * 			  substring(int start) => ���� ��ȣ
 * 			  substring(int start, int end) => end�� ���� ==> start~end-1 ���� ������!
 * 							ex) String s="Hello Java!!";
 * 									s.substring(0,5) ==> Hello 
 * 									�� ������ ������� ����! // s=s.substring(0,5) �̷��� �ָ� ���� ����
 * 			- contains() :  ���ڿ��߿� ���Ե� �ܾ �ִ��� Ȯ��
 * 			- startsWith, endsWith : ������Ʈ(�ڵ� �ϼ���(�˻�â �����˻� ������))
 * 			- trim() : �¿� ���� ����
 * 					ex) String s=" Hello Java ";
 * 							s.trim() ==> "Hello Java"  �� ��� ���� ����� ���� �� s.replace(" ","")
 * 			- equals() : ���ڿ� ���� �� ��� (��ҹ��� ���� ��)
 * 			- split() : ���ڸ� �����ؼ� �迭�� ����� �ش�
 * 					==> ���� ���ڸ� �����Ѵ�
 * 			- replace, replaceAll : ���ڸ� ������ ���
 * 			- valueOf : ��� ���������� ���ڿ��� ����
 * 			- toLowerCase() : �ҹ��� ��ȯ
 * 			- toUpperCase() : �빮�� ��ȯ
 * 
 */
import javax.swing.*;
import java.awt.event.*;
public class ���ڿ� extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public ���ڿ� ()
	{
		add("North",tf);
		add("South",tf1);
		// tf.setText(String.valueOf(20));  tf�� �⺻������ 20 �� 
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this);	// tf���� ���� => actionPerformed ȣ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���ڿ�();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)		// tf���� �Է� => ����
		{
			tf1.setText(tf.getText().toLowerCase());
		}
		}
		
	}


