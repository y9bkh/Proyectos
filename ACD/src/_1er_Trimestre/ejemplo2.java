package _1er_Trimestre;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader archivo = new FileReader("streams1.txt");
			int letra = archivo.read();
			while(letra != -1) {
				System.out.println(letra);
				letra = archivo.read();
			}
		
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);	
		}
	}
	
}
