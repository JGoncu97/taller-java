package tarea2;

import javax.swing.JOptionPane;

public class TallerGuia2Respuesta2 {
	
	public static void main(String[]args) {
		int a,b,c,d,e,f,g,h,i,j,k,l;
		
		a=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor: "));
		b=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor: "));
		c=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el terce valor: "));
		d=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuarto valor: "));
		e=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el quinto valor: "));
		f=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el sexto valor: "));
		g=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el septimo valor: "));
		h=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el octavo valor: "));
		i=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el noveno valor: "));
		j=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el decimo valor: "));
		k=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el undecimo valor: "));
		l=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el duodecimo valor: "));
		int ejercicio=(a/b+c-d+e*f*g-h/i+j-k*l);
		JOptionPane.showMessageDialog(null,"El resultado del ejercicio es: "+ ejercicio);
		
		
	}

}
