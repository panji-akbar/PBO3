package praktikum_5;

public class tumbuahan {
	private String name; 
	private int lebar;
	
	private tumbuahan (String name,int lebar) {
		name=name;
		lebar=lebar;
	
		
	}
	public tumbuahan() {
		// TODO Auto-generated constructor stub
	}
	private void cetak1(){
		System.out.println(name+" "+lebar);
	}

	public static void main(String[] args) {
		tumbuahan apa = new tumbuahan();
		apa.cetak1();
		tumbuahan ada = new tumbuahan ("bjuj",29);
		apa.cetak1();
		
		

	}

}
