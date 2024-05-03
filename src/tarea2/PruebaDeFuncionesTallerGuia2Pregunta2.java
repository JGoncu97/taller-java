package tarea2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjemploTallerGuia2Pregunta2 {

	public static void main(String[]args) throws IOException{
		int precedencia;
		
		//precedencia=BuffReader();
		//System.out.println("El resultado tomado por BufferedReader es: "+precedencia);
		//precedencia=DataInputS();
		//System.out.println("El resultado tomado por DataInputStream es: "+precedencia);
		//precedencia=scan();
		//System.out.println("El resultado tomado por Scanner es"+ precedencia);
		precedencia=JOption();
		JOptionPane.showMessageDialog(null,"El resultado tomado por JOptionPane es"+precedencia);
		
	}
	
	private static int BuffReader() throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el ejercicio de presedencia de Operadores ");
		
		String num=input.readLine();
		
		int ejercicio=Integer.parseInt(num);
		
		return ejercicio;
	}

	private static int DataInputS() throws IOException {
		
		DataInputStream input=new DataInputStream(System.in);
		
		System.out.println("Ingrese el ejercicio de presedencia de Operadores ");
		
		int ejercicio=Integer.parseInt(input.readLine());
	
		return ejercicio;
		
	}
	
	private static int JOption() {
	
		String valor="";
		
		valor=JOptionPane.showInputDialog("Ingrese el ejercicio de presedencia de Operadores ");
		
		int ejercicio=Integer.parseInt(valor);
	
		return ejercicio;
	}

	private static int scan() {
		
		Scanner input=new Scanner(System.in);

		System.out.println("Ingrese el ejercicio de presedencia de Operadores ");
		
		int ejercicio=input.nextInt();
		
	
		return ejercicio;
	}
	
}
