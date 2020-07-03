/*
 * 	
 * 	기본형 => 정수, 실수, 논리, 문자
 * 	참조형 => 실제 저장 장소 다른곳에 있음 (주소에 저장)
 * 	
 * 	문자열 => 저장하는 공간 (String)
 * 		1) 저장 방법
 * 			String s="문자저장"; ==> 많이 상ㅇ됨
 * 			String s=new String("")
 * 		2) 주요 기능
 * 			문자를 제어할 수 있는 기능(메소드) => 라이브러리 핵심
 * 			- length() : 문자 갯수
 * 			- substring() : 문자를 자를 때
 * 			  substring(int start) => 문자 번호
 * 			  substring(int start, int end) => end는 제외 ==> start~end-1 까지 가져옴!
 * 							ex) String s="Hello Java!!";
 * 									s.substring(0,5) ==> Hello 
 * 									※ 원본은 변경되지 않음! // s=s.substring(0,5) 이렇게 주면 원본 변경
 * 			- contains() :  문자열중에 포함된 단어가 있는지 확인
 * 			- startsWith, endsWith : 서제스트(자동 완성기(검색창 연관검색 같은거))
 * 			- trim() : 좌우 공백 제거
 * 					ex) String s=" Hello Java ";
 * 							s.trim() ==> "Hello Java"  ※ 가운데 공백 지우고 싶을 땐 s.replace(" ","")
 * 			- equals() : 문자열 비교할 때 사용 (대소문자 구분 함)
 * 			- split() : 문자를 구분해서 배열로 만들어 준다
 * 					==> 구분 문자를 포함한다
 * 			- replace, replaceAll : 문자를 변경할 경우
 * 			- valueOf : 모든 데이터형을 문자열로 변경
 * 			- toLowerCase() : 소문자 변환
 * 			- toUpperCase() : 대문자 변환
 * 
 */
import javax.swing.*;
import java.awt.event.*;
public class 문자열 extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public 문자열 ()
	{
		add("North",tf);
		add("South",tf1);
		// tf.setText(String.valueOf(20));  tf에 기본값으로 20 줌 
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this);	// tf에서 엔터 => actionPerformed 호출
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)		// tf에서 입력 => 엔터
		{
			tf1.setText(tf.getText().toLowerCase());
		}
		}
		
	}


