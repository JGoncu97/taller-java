package tarea3;

import javax.swing.JOptionPane;
public class PracticaCondicionales3 {
	public static void main(String[]args) {
		int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		
		if(valor < 0) {
			JOptionPane.showMessageDialog(null,"El numero es menor que cero");
		}else {
			
			}if (valor > 0) {
			JOptionPane.showMessageDialog(null,"El numero es mayor que cero");
				
			}else {
			JOptionPane.showMessageDialog(null,"El numero es igual que cero");
		}
		
	}
		
	}
