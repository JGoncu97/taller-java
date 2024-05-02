package tarea3;

import javax.swing.JOptionPane;

public class TallerGuia3Respuesta1 {

	public static void main(String[]args) {
		final double Descuento= 0.10;
		
		double valorCompra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su compra"));
		
		if(valorCompra>50000) {
			JOptionPane.showMessageDialog(null,"Su compra es mayor de $50.000 tiene un descuento del 10% por lo tanto su total es: "+ (valorCompra-(valorCompra*0.10)));
		}else {
			JOptionPane.showMessageDialog(null,"El valor de su compra es :"+ valorCompra);
		}
		
	}
}
