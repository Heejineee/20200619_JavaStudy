/*
 * 	split() : ���ڸ� �����ؼ� �ڸ��� ����  ==> String[]
 * 			  : ������ ���� ��� ����
 * 
 */
public class ���ڿ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="�ع���,���ι���,��/��,�,����Ʈ,��/����,��/��/��,ǻ��,��ġ/����/���,���/�ҽ�/��,���,������,����,��,����,��/����/��,��Ÿ";
		String[] arr=msg.split(","); // �Ϲ� ���ڿ� => �迭�� ����
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
