/**
 * 
 */
package praktikum_2;

/**
 * @author panji coy
 *
 */
public class praktikum22 {
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

		Byte refByte = new Byte((byte)123);
		byte by = refByte.byteValue();
		System.out.println("objek byte  = " + by);	
		System.out.println("------------------------------ ");
		
		Character refChar = new Character('X');
		char c= refChar.charValue();
		System.out.println("objek char  = " + c );
		System.out.println("------------------------------ ");
		
		Short refShort = new Short((short)123);
		short s= refShort.shortValue();
		System.out.println("objek short  = " + s );
		System.out.println("------------------------------ ");

		Integer refInt = new Integer(123);
		int i= refInt.intValue();
		System.out.println("objek Integer  = " + i );
		System.out.println("------------------------------ ");
		
		Long refLong = new  Long(123L);
		long l= refLong.longValue();
		System.out.println("objek Long   = " + l );
		System.out.println("------------------------------ ");
		
		Float refFloat = new Float(12.3F);
		float f = refFloat.floatValue();
		System.out.println("objek Float  = " + f );
		System.out.println("------------------------------ ");
		
		Double refDouble  = new Double(12.3D);
		double d = refDouble.doubleValue();
		System.out.println("objek Integer  = " + d );
		System.out.println("------------------------------ ");
	//	System.out.println("decimal =" + decVal);
		// TODO Auto-generated method stub

	}

}
