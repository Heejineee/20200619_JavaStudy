
import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * »ç¿ëÀÚ => Á¤¼öÀÔ·Â (1~12)
		 * 12, 1, 1 => °Ü¿ïÀÔ´Ï´Ù
		 * 3, 4, 5 => º½ÀÔ´Ï´Ù
		 * 6, 7, 8 => ¿©¸§ÀÔ´Ï´Ù
		 * 9, 10, 11 => °¡À»ÀÔ´Ï´Ù
		 */
		/*
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä (1~12)");
		month=scan.nextInt();
		
		if(month==12 || month>=1 && month<3)
		{
			System.out.println("°Ü¿ïÀÔ´Ï´Ù");
		}
		else if(month>=3 && month<6)
		{
			System.out.println("º½ÀÔ´Ï´Ù");
		}
		else if(month>=6 && month<9)
		{
			System.out.println("¿©¸§ÀÔ´Ï´Ù");
		}
		else if(month>=9 && month<12)
		{
			System.out.println("°¡À»ÀÔ´Ï´Ù");
		}
		else
			System.out.println("1~12ÀÇ ¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		*/
		
		//¹®ÀÚ ÀÔ·Â¹Þ¾Æ¼­ ¼ýÀÚ/¾ËÆÄºª/ÇÑ±Û/Æ¯¼ö¹®ÀÚ ±¸ºÐ
		char ch='a';
		System.out.println("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä!");
		Scanner scan=new Scanner(System.in);
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("¼ýÀÚÀÔ´Ï´Ù");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("¾ËÆÄºª ÀÔ´Ï´Ù");
		}
		else if(ch>='°¡' && ch<='ÆR' || ch>='¤¡' && ch<='¤¾')
		{
			System.out.println("ÇÑ±Û ÀÔ´Ï´Ù");
		}
		else 
		{
			System.out.println("Æ¯¼ö¹®ÀÚ ÀÔ´Ï´Ù");
		}
	}

	
	
}
