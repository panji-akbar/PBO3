package praktikum_5;

class titik {
	public int x;
	public int y;
	public titik(){
		x=0;
		y=0;
	}
}

public class argument {
	public static void passingprimitif(int i){
		i=5;
	}
	public static void passingObject(titik t){
		t.x=4;
		t.y=5;
	
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5; 
		passingprimitif(i);
		System.out.println(i);
		
		 titik t= new titik();
		 passingObject(t);
		 System.out.println(t.x +" "+t.y);
	}

}