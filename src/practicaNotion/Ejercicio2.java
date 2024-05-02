package practicaNotion;

import javax.swing.JOptionPane;

/*Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:*/

public class Ejercicio2 {

	public static void main(String[]args) {
		int suma=0;
		int estudiantes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de estudiantes a Promediar"));
		
		for(int i=0;i<estudiantes;i++) {
			double calificaciones = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese cual es la calificacion del estudiante"));
				
				suma+=calificaciones;
			
		}
		
		double promedio =suma/estudiantes;
		
		JOptionPane.showMessageDialog(null,"La cantidad de estudiantes a evaluar son: "+estudiantes+" y el promedio calculado de esos estudiantes es: "+promedio);
		
	}
	
}
