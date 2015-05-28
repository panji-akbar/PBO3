/**
 * 
 */
package praktikum_2;

/**
 * @author panji
 *
 */
public class praktikum23 {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String str;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean refBool = new Boolean(true);
		boolean bool = refBool.booleanValue();
		System.out.println("objek bolean  = " + bool);	
		System.out.println("------------------------------ ");
		f=(float) 15.5;
		i=15;
		if (i==f)
		{
		System.out.println("nilai1 == nilai2" );	
		}
		if (bool == true)
		{System.out.println("nilainya sudah berubah");
		}
		if (l < 5)
		{System.out.println("nilainya kurang dari 5");
		}
		
		// TODO Auto-generated method stub

	}

}