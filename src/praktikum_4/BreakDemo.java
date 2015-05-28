package praktikum_4;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] angka = { 1, 2, 4, 23, 44, 1, 67, 89 };
		int cari = 44;
		int i;
		Boolean ketemu = false;
		for (i = 0; i < angka.length; i++) {
			if (angka[i] == cari) {
				ketemu = true;
				break;
			}
		}
		if (ketemu) {
			System.out.println("ditameukan " + cari + " pada indekx " + i);
		}

		else {
			System.out.println(cari + " tdaka ada mapa dilai array");
		}
	}

}
