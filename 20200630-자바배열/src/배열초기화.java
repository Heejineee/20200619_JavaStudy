/*
 * 		1. ���� ���ÿ� �ʱ�ȭ : int[] arr={10,20,30,40,50};
 * 		2. �޸� ������ ���� ���߿� ���� ä��� :  int[] arr=new int[5];
 * 																	int[] arr;
 * 																	arr[0]=10;
 * 																	arr[1]=20; ...
 * 		3. for => ���� / for-each => ��� ���
 */
public class �迭�ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"ȫ�浿","�ڹ���","�̼���","������","��û��"};
				for(int i=0; i<names.length; i++)
				{
					System.out.println(names[i]);
				}
				System.out.println("====== for-each ======");
				for(String name:names)
				{
					System.out.println(name);
				}
				// for-each�� ������ �Ұ��� => ȭ�鿡 ��¸� ���
					
		}

	}
