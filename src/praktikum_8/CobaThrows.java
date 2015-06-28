package praktikum_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CobaThrows {
	
	public static void cobametode() 
		throws FileNotFoundException,ParseException
		{FileInputStream file =new FileInputStream("c:/coba.txt");
		SimpleDateFormat.getInstance().parse("12345");
		}
		
	public static void cobametodedua() {
		try {
			cobametode();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi ");
		}catch (ParseException e) {
			System.out.println("ParseException terjadi ");
		}	
	}
	public static void main(String[] args) {
		cobametodedua();
	}

}
