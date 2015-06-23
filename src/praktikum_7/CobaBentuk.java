package praktikum_7;

import praktikum_7.Model;
import praktikum_7.BujurSangkar;
import praktikum_7.SegitigaSamaKaki;
import praktikum_7.SegitigaSamaSisi;
public class CobaBentuk {
	
	public static void cetakBangun(Model b) {
		
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	
	public static void main(String args[]) {
		
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}
}
