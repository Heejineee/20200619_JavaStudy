/*
 * 		1. 선언 동시에 초기화 : int[] arr={10,20,30,40,50};
 * 		2. 메모리 공간만 제작 나중에 값을 채운다 :  int[] arr=new int[5];
 * 																	int[] arr;
 * 																	arr[0]=10;
 * 																	arr[1]=20; ...
 * 		3. for => 제어 / for-each => 출력 담당
 */
public class 배열초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","박문수","이순신","춘향이","심청이"};
				for(int i=0; i<names.length; i++)
				{
					System.out.println(names[i]);
				}
				System.out.println("====== for-each ======");
				for(String name:names)
				{
					System.out.println(name);
				}
				// for-each는 변경이 불가능 => 화면에 출력만 담당
					
		}

	}
