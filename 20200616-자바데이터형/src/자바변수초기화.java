
public class �ڹٺ����ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=78;
		int eng=85;
		int math=96;
		/*
		 * 	���ڿ� ����
		 *  7+7+"1"+7+7
		 *  ===
		 *  14+"1"
		 *  ====
		 *  "141"+7
		 *  "1417"+7
		 *  "14177"
		 */
		System.out.println(7+7+"1"+7+7);
		System.out.println("���� : "+kor+eng+math);
		System.out.println("���� : "+(kor+eng+math));
		
		int a=65;
		char c=65; //char => ����, ����
		System.out.println("a = "+a);
		System.out.println("c = "+c);
		
		int d=1;
		int e='1';
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		//char�� ����, ���� ����Ѵ�.
		
		/* long = int => O
		 *  8 		  4
		 *  
		 *  int = long => X
		 *   4  	  8
		 *   
		 *   double = int, long, float => O
		 *   int = double => X
		 *   
		 *   ���� char = int => O
		 * 
		 * float f=10.6; => X
		 * double f=10.6 / float f=10.6f => O
		 */
		
		// byte < char < int < long < float < double
		
		System.out.println(100); //100�� int
		System.out.println(10.8); //10.8�� double
		
		double i=21400000000L;	
	}

}
