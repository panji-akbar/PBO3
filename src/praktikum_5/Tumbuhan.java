package praktikum_5;

public class Tumbuhan {
	public void tanam() {
		System.out.println("tanam 1");
	}
	public void tanam(String nama) {
		System.out.println("tanam 2");
	}
	
	public void tanam(int nama) {
		System.out.println("tanam 3");
	}
	public void tanam(long nama) {
		System.out.println("tanam 4");
	}
	public String tanam(String nama,int tanam) {
		return "tanam 5";
	}
	public static void main(String[] args) {
	Tumbuhan tumbuh = new Tumbuhan();	
	tumbuh.tanam();
	tumbuh.tanam("sayur_coy");
	tumbuh.tanam(67);
	tumbuh.tanam(112);
	System.out.println(tumbuh.tanam("sayur",6));
	}
}
