package tarea3;

import javax.swing.JOptionPane;

public class PracticaCondicional {
	
	public static void main(String[]args) {
		int x=-4;
		
		if(x<0) {
			JOptionPane.showMessageDialog(null, "El valor de x es: "+ (x=x*-1));
		}else {
			JOptionPane.showMessageDialog(null,"El numero x es: "+ x);
		}
	}
}
