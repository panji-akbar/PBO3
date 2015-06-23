package praktikum_6;
import praktikum_6.mesin;
import praktikum_6.rangka;
import praktikum_6.mobil;

public class sedan extends mobil {
	public  sedan() {
		
	}
	
	public static void stater() {
		System.out.println("stater Sedan");
	}
	
	public void panjang() {
		mesin =new mesin();
		jenis();
		nama="Sedan Coy";
				System.out.println("sedan timor");
	}

	public static void main(String[] args) {
		sedan tiomr= new sedan();
		tiomr.panjang();

	}

}
