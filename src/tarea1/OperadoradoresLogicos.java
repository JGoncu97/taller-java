package tarea1;

public class OperadoradoresLogicos {
	public static void main(String[] args) {

	    int x= 1;
	    boolean operacion1=(x>0 && x<=6);
	    System.out.println(operacion1);

	    int a= -1;
	    boolean operacion2=(a<0 || a>6);
	    System.out.println(operacion2);

	    int b=4;
	    boolean operacion3=!(b<0);
	    System.out.println(operacion3);
	  }
}
