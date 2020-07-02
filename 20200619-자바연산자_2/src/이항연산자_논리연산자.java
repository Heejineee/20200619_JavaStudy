/*
 * 		논리연산자
 * 		형식 ) &&(and, 직렬), ||(or, 병렬)
 * 				=========  ========
 * 					두개 true		한개 이상 true
 * 				&& : 범위, 기간을 포함하는 경우에 주로 사용
 * 				|| : 범위나 기간을 벗어나는 경우에 주로 사용
 * 		쓰는방식) 조건 (&&, ||) 조건
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
 * 		효율적인 연산 : 앞에 값에 따라 뒤에 것 계산 할지 안할지
 * 							: && ==> 왼쪽에 있는 조건이 false면 뒤에 안함
 * 							: || ==> 왼쪽에 있는 조건이 true면 뒤에 안함
 * 		int a=10;
 * 		int b=9;
 * 
 * 		a<b && ++b==a; //false
 * 		b=9 왜냐면 a<b가 false여서 여기서 연산 끝남
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='A';
		int i=65;
		char c2='B';
		//boolean bChect=c1==i || ++c1==c2; 변수에 넣어서
		//System.out.println(bCheck);
		
		//System.out.println(c1==i && ++c1==c2); 그냥 바로
		//System.out.println(c1);
		System.out.println(c1==i || ++c1==c2); //true, c1 증가 안함. 앞에가 true여서 true니까 뒤에 안해서
		System.out.println(c1);
		
		
	}

}
