package tarea3;

import javax.swing.JOptionPane;

public class PracticaCondicional2 {
	
	public static void main(String[]args) {
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor Ingrese su edad"));
		
		if (edad>=18) {
			JOptionPane.showMessageDialog(null,"Eres mayor de edad");
		}else {
			JOptionPane.showMessageDialog(null,"Eres menor de edad");
		}
		
	}
	
}
