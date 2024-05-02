package tarea1;

public class OperadoresAritmeticos {
	public static void main(String[] args) {

	    int x = 14;
	    int y = 2;
	    System.out.println("El valor de X es: " + x + " y el valor de Y es: " + y);

	    int suma = x + y;
	    System.out.println("La suma de X y Y es: " + suma);

	    int resta = x - y;
	    System.out.println("La resta de X y Y es: " + resta);

	    int multiplicacion = x * y;
	    System.out.println("La multiplicacion de X y Y es: " + multiplicacion);

	    int division = x / y;
	    System.out.println("La division de X y Y es: " + division);

	    int modulo = x % y;
	    System.out.println("El modulo de X y Y es: " + modulo);

	    int modulo2 = x % 3;
	    System.out.println("El modulo2 de X y 3 es: " + modulo2);

	    x = 14;
	    int incrementoPostFijo = x++;
	    System.out.println("El valor de X es: " + x + " y el valor de incrementoPostFijo es: " + incrementoPostFijo);

	    x = 14;
	    int incrementoPreFijo = ++x;
	    System.out.println("El valor de X es: " + x + " y el valor de incrementoPreFijo es: " + incrementoPreFijo);

	    x = 14;
	    int decrementoPostFijo = x--;
	    System.out.println("El valor de X es: " + x + " y el valor de decrementoPostFijo es: " + decrementoPostFijo);

	    x = 14;
	    int decrementoPreFijo = --x;
	    System.out.println("El valor de X es: " + x + " y el valor de decrementoPreFi es: " + decrementoPreFijo);

	  }
}
