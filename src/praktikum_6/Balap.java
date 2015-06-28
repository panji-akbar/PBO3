package praktikum_6;

import praktikum_6.mobil;

public class Balap extends mobil {
	public  String nama;
	public Balap() {
		super();
	}
	
	public Balap(String nama) {
		super(nama);
	}
	public void cetak(String nama){
		super.nama=nama;
		this.nama="sedan lokal";
		System.out.println(nama);
		System.out.println(this.nama);
	}
	public static void stater() {
		System.out.println("stater Balap");
	}

	public static void main(String[] args) {
		Balap cepat=new Balap();
		cepat.cetak("BAlapan");
	}
}
