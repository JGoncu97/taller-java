package tarea1;

import javax.swing.JOptionPane;

/*4.Realice un programa que permita calcular el sueldo final 
*de un empleado, tenga en cuenta que el sueldo depende de un 
*incremento del 30%, haga el algoritmo definiendo el porcentaje como una constante.
*/
public class TallerGuia1Respuesta4 {
	public static void main(String[] args) {
		
		final double porciento= 0.30;
		
		String valor="";
		
		valor=JOptionPane.showInputDialog("Ingrese cual es el Sueldo neto");
		
		double sueldoOriginal=Double.parseDouble(valor);
		double sueldoFinal= sueldoOriginal+(sueldoOriginal*0.30);
		System.out.println("El Sueldo final del empleado con un aumento de 30% es: "+sueldoFinal);
	}
}
