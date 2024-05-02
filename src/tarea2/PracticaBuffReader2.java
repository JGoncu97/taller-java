package tarea2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticaBuffReader2 {

	public static void main(String[]args) throws IOException {
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in)); 
			
			String num="";
			
			int valorA=0;
			int valorB=0;
			
			System.out.println("Ingrese el valorA: ");
			num = entrada.readLine();
			valorA=Integer.parseInt(num);
			System.out.println("El valor de A es: "+ valorA);
			
			System.out.println("Ingrese el valor de B: ");
			num=entrada.readLine();
			valorB=Integer.parseInt(num);
			System.out.println("El valor de B es: "+ valorB);
			
			int suma=valorA + valorB;
			System.out.println("la suma de los valores es: "+ suma);
		
	}
	
}

