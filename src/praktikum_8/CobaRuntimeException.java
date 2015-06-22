package praktikum_8;

public class CobaRuntimeException {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[6];			
			System.out.println("akses element ke empat: " +a[7]);
		} catch (ArrayIndexOutOfBoundsException e ){
			System.out.println("IndexOutOfBoundsException terjadi "+e);
		}
		System.out.println("keluar blok eksepsi" );
	}

}
