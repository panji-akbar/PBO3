
	package praktikum_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

	public class CobaCheckedException3 {

		public static void main(String[] args) {
			try {
				FileInputStream file= new FileInputStream("c:/coba.txt");
				file.close();
		
			
			}
			catch (IOException e) {
				System.out.println("IOException terjadi ");
			}

		}

	}
