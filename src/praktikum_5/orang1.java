package praktikum_5;

public class orang1 {
	public String nama;
	public String alamat;
	public int tinggiBadan;
	public float  beratBadan;
	 
	public void cetakorang1() {
		System.out.println(nama +","+alamat+","+tinggiBadan+","+beratBadan);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orang1 objekOrang= new orang1();
		objekOrang.nama ="panji";
		objekOrang.alamat="maros";
		objekOrang.tinggiBadan =112;
		objekOrang.beratBadan=67;
		objekOrang.cetakorang1();
		
		orang1 objekOrang1= new orang1();
		objekOrang1.nama ="coy ";
		objekOrang1.alamat="maros";
		objekOrang1.tinggiBadan =112;
		objekOrang1.beratBadan=67;
		objekOrang1.cetakorang1();

	}
}
