package tarea2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TallerGuia2Respuesta1 {

	public static void main(String[]args) throws IOException{
		Double sueldoBase ;
		
		sueldoBase=BuffReader();
		System.out.println("El sueldo final en BufferedReader es: "+sueldoBase);
		//sueldoBase=DataInputS();
		//System.out.println("El sueldo final en DataInputStream es: "+sueldoBase);
		//sueldoBase=scan();
		//System.out.println("El sueldo final en Scanner es: "+ sueldoBase);
		//sueldoBase=JOption();
		//JOptionPane.showMessageDialog(null,"El sueldo final en JOption es: "+sueldoBase);
	}
	
	private static Double BuffReader() throws IOException {
		final double porciento= 0.30;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese cual el Sueldo base en el Mes: ");
		String num=input.readLine();
		double sueldo=Double.parseDouble(num);
		double sueldoFinal= sueldo+(sueldo*porciento);
		return sueldoFinal;
	}

	private static Double DataInputS() throws IOException {
		final double porciento= 0.30;
		
		DataInputStream input=new DataInputStream(System.in);
		System.out.println("Ingrese cual el Sueldo base en el Mes: ");
		double sueldo=Double.parseDouble(input.readLine());
		Double sueldoFinal= sueldo+(sueldo*porciento);
		return sueldoFinal;
		
	}
	
	private static Double JOption() {
		final double porciento= 0.30;
		
		String valor="";
		
		valor=JOptionPane.showInputDialog("Ingrese cual es el Sueldo base: ");
		
		double sueldoOriginal=Double.parseDouble(valor);
		double sueldoFinal= sueldoOriginal+(sueldoOriginal*porciento);
		return sueldoFinal;
	}

	private static Double scan() {
		final double porciento= 0.30;
		
		Scanner input=new Scanner(System.in);

		System.out.println("Ingrese cual el Sueldo base en el Mes: ");
		
		Double sueldo=input.nextDouble();
		
		Double sueldoFinal=sueldo+(sueldo*porciento);
		return sueldoFinal;
	}

	
	
	
}
