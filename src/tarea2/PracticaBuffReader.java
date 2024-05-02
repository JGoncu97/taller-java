package tarea2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticaBuffReader {

	public static void main (String[] args) throws IOException{
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		 String nomb="";
		 System.out.println("Ingrese un Nombre");
		 
		 nomb=entrada.readLine();
		 
		 System.out.println("El nombre ingresado es: " + nomb);
		
	}
	
}
