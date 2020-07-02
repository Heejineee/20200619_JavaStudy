/*
 * 부정 연산자 : !
 * 		=> true->false, false->true
 * 		=> 결과값 : boolean
 * 
 * 	단항 : 증감 => int
 * 			부정 => boolean(고정)
 *  이항 : 산술 => ? (뭐가 나올지 모름!)
 *  				   int + int = int
 *  				   double + int = double
 *  		비교, 논리 => boolean
 *  	
 * 		
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=true;
		bCheck=!bCheck; //true의 반대값을 저장
		bCheck=!bCheck; 
		System.out.println("bCheck="+bCheck); 
	}

}
