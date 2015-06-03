package praktikum_5;

public class hewan3 {
	public static int jumalah_hewan=0;
	public String spesies;
	public  static void tambah_hewan(){
		jumalah_hewan++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hewan3 objekHewan = new hewan3();
		objekHewan.spesies="meong";
		hewan3.tambah_hewan();
		System.out.println(hewan3.jumalah_hewan);
		
		hewan3 objekHewan2 = new hewan3();
		objekHewan2.spesies="cokie";
		hewan3.tambah_hewan();
		System.out.println(hewan3.jumalah_hewan);
		
		System.out.println(objekHewan.jumalah_hewan);
		System.out.println(objekHewan2.jumalah_hewan);
		//System.out.println();
		
	}

}

