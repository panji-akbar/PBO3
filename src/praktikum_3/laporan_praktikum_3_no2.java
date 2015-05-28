/**
 * 
 */
package praktikum_3;

/**
 * @author panji coy
 *
 */
public class laporan_praktikum_3_no2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =10 ,b =-5 ;
       	String konversi;
       	
    	konversi=Integer.toBinaryString(a);
		System.out.println("variabel a : "+(a )+" pola bit : "+(konversi));
		konversi=Integer.toBinaryString(b);
		System.out.println("variabel b : "+(b )+" pola bit : "+(konversi));
		System.out.println();
		
       	konversi=Integer.toBinaryString(~a);
		System.out.println("~a : "+(~a )+" pola bit : "+(konversi));
		
		
		konversi=Integer.toBinaryString(~b);
		System.out.println("~b : "+(~b )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(a&6);
		System.out.println("a&6 : "+(a & 6 )+" pola bit :"+(konversi));
		
		konversi=Integer.toBinaryString(a|5);
		System.out.println("a|5 : "+(a | 5 )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(a^4);
		System.out.println("a^4 : "+(a^4 )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(a >> 2);
		System.out.println("a>>2 : "+(a >> 2 )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(b >> 5);
		System.out.println("b>>5 : "+(b >> 5 )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(a  << 3);
		System.out.println("a<<3 : "+(a  << 3 )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(a  >>> 3);
		System.out.println("a>>>3 : "+(a  >>> 3 )+" pola bit : "+(konversi));
		
		konversi=Integer.toBinaryString(b  >>> 3 );
		System.out.println( "b>>>3: "+(b >>> 3 )+" pola bit : "+(konversi));
		
		//System.out.println(a >> 2);
		//System.out.println(b >> 5);
		//System.out.println(a  << 3);
	//	System.out.println(a  >>> 3);
		//System.out.println(b  >>> 3);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
