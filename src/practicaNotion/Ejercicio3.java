package practicaNotion;

import javax.swing.JOptionPane;

/*Haga un algoritmo que solicite n números e indique si son positivos o negativos, también debe indicar si tiene uno o más de 2 dígitos*/

public class Ejercicio3 {
	
	
	public static void main(String[]args) {
		
		int suma=0;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos numeros desea evaluar"));
		
		for(int i=0;i<numero; i++) {
			
		int valorA=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer valor"));
		
		suma+= valorA;
		
		}
		
		if(suma>=0 && suma<=9) {
			JOptionPane.showMessageDialog(null,"EL numero es positivo y es de un solo digito");
		}else if(suma >=10 && suma<=99) {
			JOptionPane.showMessageDialog(null,"El numero es positivo y es de dos digitos");
		}else if(suma>=100) {
			JOptionPane.showMessageDialog(null,"El numero es positivo y es de mas de dos digitos");
		
		}else {
			if(suma<=-1 && suma>=-9) {
				JOptionPane.showMessageDialog(null,"El numero es negativo y es de un solo digito ");
			}else if(suma<=-10 && suma>=-99) {
				JOptionPane.showMessageDialog(null,"El numero es negativo y es de de dos digitos");
			}else {
				JOptionPane.showMessageDialog(null, "El numero es negativo y es de mas de dos digitos");
			}
		}
		
		
	}

}
