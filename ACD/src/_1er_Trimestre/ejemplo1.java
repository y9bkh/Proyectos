package _1er_Trimestre;

import java.io.FileWriter;
import java.io.IOException;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String frase = "Nos queda unna hora de clase";
			String nombreArchivo = "streams1.txt"; //
			
			//
			FileWriter archivo = new FileWriter(nombreArchivo);
			
			//
			archivo.write(frase);
			
			//
			archivo.close();
			
			
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
