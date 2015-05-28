package praktikum_4;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = "ular lari lurus melingkar dipinggir pagar umar";
		int maks = kalimat.length();
		int jumlahR = 0;
		for (int i = 0; i < maks; i++) {
			if (kalimat.charAt(i) != 'r')
				continue;
			jumlahR++;

		}
		System.out
				.println("ditemukan "
						+ jumlahR
						+ " hruf R dalam Kalimat  :"
						+ " ular lari lurus melingkar dipinggir pagar umar");
	}

}
