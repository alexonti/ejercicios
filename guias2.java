 package guias;
 
 import java.util.*;

public class guias2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algoritmo que intercambia valores entre 2 variables enteras
		
		Scanner entrada=new Scanner(System.in);
		//Scanner entrada2=new Scanner(System.in);
		
		System.out.println("Intercambio de valores");
		System.out.println();

		System.out.println("Ingrese el valor del número a");
		int a=entrada.nextInt();
		System.out.println();
		System.out.println("Ingrese el valor del nùmero b");
		System.out.println();
		int b=entrada.nextInt();
		System.out.println();
		int c;
		entrada.close();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("El nuevo valor de a es: "+a);
		System.out.println("El nuevo valor de b es: "+b);

		
		
		
			
				
		
		
	}

}
