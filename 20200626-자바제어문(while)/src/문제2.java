
public class ¹®Á¦2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, sum=0;
		for(int i=100; i<=999; i++)
		{
			if(!(i%4==0))
			{
				count++;
				sum+=i;
			}
		}
		System.out.println("°¹¼ö : "+count);
		System.out.println("ÇÕ : "+sum);
		
		count=0;
		sum=0;
		int i=100;
		while(i<=999)
		{
			if(!(i%4==0))
			{
				count++;
				sum+=i;
			}
			i++;
		}
		System.out.println("°¹¼ö : "+count);
		System.out.println("ÇÕ : "+sum);
	}

}
