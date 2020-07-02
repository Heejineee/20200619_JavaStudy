/*
 * Á¶°Ç¹® Á¦ÀÛÇÏ´Â ¹æ¹ý
 * 
 * if (Á¶°Ç¹®) : Á¶°Ç¹®Àº ¹«Á¶°Ç °á°ú°ª true/false
 * 				  : ÇÊ¿äÇÑ °æ¿ì(Á¶°Ç : true)¿¡¸¸ ¹®ÀåÀ» ¼öÇà/falseÀÏ °æ¿ì¿¡´Â °Ç³Ê¶Ú´Ù(¹®ÀåÀ» ¼öÇàÇÏÁö ¸øÇÑ´Ù)
 */
public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		System.out.println("1");
		System.out.println("2");
		// a°ªÀÌ Â¦¼öÀÏ °æ¿ì¿¡ Ãâ·Â
		if(a%2==0)
			System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		//¾ËÆÄºªÀ» ÀúÀåÇÏ°í ´ë¹®ÀÚ/¼Ò¹®ÀÚ ±¸ºÐ
		char alpha='\t';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"(´Â)Àº ´ë¹®ÀÚ ÀÔ´Ï´Ù.");
		if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"(´Â)Àº ¼Ò¹®ÀÚ ÀÔ´Ï´Ù.");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"(´Â)Àº ¼ýÀÚ ÀÔ´Ï´Ù.");
		if(alpha>='°¡' && alpha<='ÆR')
			System.out.println(alpha+"(´Â)Àº ÇÑ±Û ÀÔ´Ï´Ù.");
		if(alpha=='\t' || alpha=='\n')
			System.out.println(alpha+"(´Â)Àº Æ¯¼ö¹®ÀÚ ÀÔ´Ï´Ù.");
	}

}
