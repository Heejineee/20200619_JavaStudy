/*
 * 		��������
 * 		���� ) &&(and, ����), ||(or, ����)
 * 				=========  ========
 * 					�ΰ� true		�Ѱ� �̻� true
 * 				&& : ����, �Ⱓ�� �����ϴ� ��쿡 �ַ� ���
 * 				|| : ������ �Ⱓ�� ����� ��쿡 �ַ� ���
 * 		���¹��) ���� (&&, ||) ����
 * 				ex) jumsu>=90 && jumsu<=100
 * 					 jumsu<=0 || jumsu>100
 * 
 * 									&&			||
 * 			======================
 * 			true true			true		  true
 * 			======================
 * 			true false		    false		  true
 * 			======================
 * 			false true			false		  true
 * 			======================
 * 			false false			false		  false
 * 			======================
 * 
 * 		ȿ������ ���� : �տ� ���� ���� �ڿ� �� ��� ���� ������
 * 							: && ==> ���ʿ� �ִ� ������ false�� �ڿ� ����
 * 							: || ==> ���ʿ� �ִ� ������ true�� �ڿ� ����
 * 		int a=10;
 * 		int b=9;
 * 
 * 		a<b && ++b==a; //false
 * 		b=9 �ֳĸ� a<b�� false���� ���⼭ ���� ����
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='A';
		int i=65;
		char c2='B';
		//boolean bChect=c1==i || ++c1==c2; ������ �־
		//System.out.println(bCheck);
		
		//System.out.println(c1==i && ++c1==c2); �׳� �ٷ�
		//System.out.println(c1);
		System.out.println(c1==i || ++c1==c2); //true, c1 ���� ����. �տ��� true���� true�ϱ� �ڿ� ���ؼ�
		System.out.println(c1);
		
		
	}

}
