package tarea2;

import java.io.IOException;
import java.util.Scanner;

public class PracticaScanner {
	
	public static void main(String[]args) throws IOException{
		
		Scanner input= new Scanner (System.in);
		String cadena="";
		System.out.println("Digite el nombre: ");
		cadena = input.next();
		System.out.println("El nombre ingresado es: "+ cadena);
	}

}
