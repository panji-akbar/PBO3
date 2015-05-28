/**
 * 
 */
package praktikum_3;

import java.util.function.BinaryOperator;

import javax.naming.BinaryRefAddr;

/**
 * @author panji coy
 *
 */
public class laporan_praktikum_3_no1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte angka =5;
		Byte angka2= -5;
	//	int a,b,c,d,e,f;
		
		String konversi;
		
		
		konversi=Integer.toBinaryString(angka);
		
		int hasil = angka++ >> 4 + 5 * 4 | 5 << angka2;
		System.out.println("bilangan desimal hasil : " +hasil);
		konversi=Integer.toBinaryString(hasil);
		System.out.println("bilangan biner hasil : "+konversi);
		 System.out.println();
	
		konversi=Integer.toBinaryString(angka++);
		System.out.println("angka++ / 5++ : "+(konversi));
		System.out.println();
		
		konversi=Integer.toBinaryString(5*4);
		System.out.println("5*4: "+(konversi));
		System.out.println();
		
		konversi=Integer.toBinaryString(20+4);
		System.out.println("20+4 : "+(konversi));
		System.out.println();
		
		konversi=Integer.toBinaryString(6>>24);
		System.out.println("angka++ >> 24 : "+(konversi));
		System.out.println();
		
		konversi=Integer.toBinaryString(5<<angka2);
		System.out.println("5 << angka2 : "+(konversi));
		System.out.println();
		
		konversi=Integer.toBinaryString(0|671088640);
		System.out.println("0 | 5 : "+(konversi));
		System.out.println();
		// TODO Auto-generated method stub

	}

}
