/*
 * ��Ʈ������ => ��Ʈ�� ��Ʈ�� ����
 * 
 * 			&(and)		|(or)		^(xor)		==> ȸ��, ��ȣȭ/��ȣȭ
 *   	    	(*)	 		  (+)		 (������ 0, �ٸ��� 1)
 *  	===================
 *  	 00	 0				0			0
 *  	01	    0				1			1
 *	    10		0				1			1	
 *  	11		1				1			0
 * 		 ===================
 *  		10 & 5 => 1010 & 0101 = 0000 ==> 0
 *  		10  |  5 => 1010 | 0101 = 1111 ==>15
 *  		10 ^ 5 => 1010 ^ 0101 = 1111 ==>15
 *  
 */
public class ���׿�����_��Ʈ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10&5);
		System.out.println(10|5);
		System.out.println(10^5);
	}

}
