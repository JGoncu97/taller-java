package practicaNotion;

import javax.swing.JOptionPane;

/*Cree un algoritmo que lea n cantidad de números y determine si son divisible entre 3.*/

public class Ejercicio1 {
	
	public static void main(String[]args) {
		
		int repeticion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de veces que desea repetir"));
		
		for(int i=0; i<repeticion; i++) {
			
			int valor=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para determinar si es divisible por 3"));
			
			if(valor% 3==0) {
				JOptionPane.showMessageDialog(null,"El numero es divisible entre 3");
			}else {
				JOptionPane.showMessageDialog(null,"El numero no es divisible entre 3");
			}
			
		}
		
		
	}

}
