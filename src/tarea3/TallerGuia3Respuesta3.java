package tarea3;

import javax.swing.JOptionPane;

public class TallerGuia3Respuesta3 {
	public static void main(String[]args) {
		
		String numero=JOptionPane.showInputDialog("Ingrese un valor entre 1 y 4 para determinar su estacion");
		
		switch(numero) {
		case "1":
			JOptionPane.showMessageDialog(null,"Invierno" );
			break;
		case "2":
			JOptionPane.showMessageDialog(null,"Verano" );
			break;
		case "3":
			JOptionPane.showMessageDialog(null,"Otoño" );
			break;
		case "4":
			JOptionPane.showMessageDialog(null,"Primavera" );
			break;
		}
		
	}

}
