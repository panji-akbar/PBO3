package praktikum_5;

public class argument2 {

	public static void argumentArray (int[] args) {
		System.out.println(args[0]+"," + args[1]+","+args[2]);
		
	}
	
	public static void argumengtSembarang(int... args) {
		System.out.println(args[0]+"," + args[1]+","+args[2]);
		
	}
	public static void main(String[] args) {
			int i[]={1,2,3};
			argumentArray(i);
			argumengtSembarang(i);
			

	}
	

}
