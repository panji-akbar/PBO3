package praktikum_4;

public class if_then_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skor = 76;
		char grade;

		if (skor >= 90) {
			grade = 'A';
		} else if (skor >= 80) {
			grade = 'B';

		} else if (skor >= 70) {
			grade = 'C';

		} else {
			grade = 'D';

		}
		System.out.println("garde = " + grade);
	}

}
