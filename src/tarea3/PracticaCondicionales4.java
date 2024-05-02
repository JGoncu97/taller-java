package tarea3;

import javax.swing.JOptionPane;

public class PracticaCondicionales4 {
	public static void main(String[]args) {
		
		String simbologia=JOptionPane.showInputDialog("Ingrese el signo de operacion que desea realizar");
		
		switch(simbologia) {
		case "+":
			JOptionPane.showMessageDialog(null,"Usted desea realizar una suma");
			break;
		case "-":
			JOptionPane.showMessageDialog(null,"Usted desea realizar una resta");
			break;
		case "*":
			JOptionPane.showMessageDialog(null,"Usted desea realizar una multiplicacion");
			break;
		case "/":
			JOptionPane.showMessageDialog(null,"Usted desea realizar una division");
			break;
		case "%":
			JOptionPane.showMessageDialog(null,"Usted desea realizar un modulo");
			break;
		
		}
		
		
	}

}
