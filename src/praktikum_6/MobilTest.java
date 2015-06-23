package praktikum_6;

public class MobilTest {
	public static void staraterMobil(mobil motor) {
		mobil.stater();
	}

	public static void main(String[] args) {
		 mobil F1=new Balap();
		 sedan tiomr= new sedan();
		 staraterMobil(new mobil());
		 staraterMobil(F1);
		 staraterMobil(tiomr);
	}

}
