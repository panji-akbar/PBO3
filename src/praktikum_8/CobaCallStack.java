package praktikum_8;

public class CobaCallStack {
	
	public void metode1(){
		int a[]=new int[2];
		System.out.println("element akses ke 3 :" +a[3]);
		System.out.println("ini tdk di cetk");
	}
	
	public void metode2() {
		try{ metode1();
			System.out.println("ini tdk di ctk");
		}catch (IndexOutOfBoundsException e ){
			System.out.println("IndexOutOfBoundsException terjadi");
		}
		System.out.println("stlh eksepsi");
	}

	public static void main(String[] args) {
		
			new CobaCallStack().metode2();
	}

}
