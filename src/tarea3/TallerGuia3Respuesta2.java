package tarea3;

import javax.swing.JOptionPane;

public class TallerGuia3Respuesta2 {

	public static void main(String[]args) {
		
		int valorA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
		int valorB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
		
		if(valorA>valorB) {
			JOptionPane.showMessageDialog(null,"El primer Valor "+valorA+" es mayor");
		}else if(valorB>valorA) {
			JOptionPane.showMessageDialog(null,"El segundo Valor "+valorB+" es mayor");
		}else {
			JOptionPane.showMessageDialog(null,"Ambos valores son iguales");
		}
		
	}
	
}
