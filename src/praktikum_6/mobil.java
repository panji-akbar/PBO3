package praktikum_6;

	import praktikum_6.rangka;

public class mobil {
	public rangka rangka1;
	public praktikum_6.mesin mesin ;
	public mobil(String nama) {
		this.nama=nama;
		
	}
	public static void stater() {
		System.out.println("stater mobil");
	}
	
	private int nomer;
	protected String nama;
	
	public mobil(){
		rangka1=new rangka();
		mesin=new praktikum_6.mesin();
		System.out.println("konstruk mobil");
		
	}
	
	public void jenis() {
		System.out.println("jenis mObil");
		
	}

}
