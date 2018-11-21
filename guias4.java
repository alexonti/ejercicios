package guias;

import java.util.Scanner;

public class guias4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Operaciones matemáticas básicas");
		System.out.println();

		System.out.println("Ingrese el valor del número a");
		double a=entrada.nextInt();
		System.out.println();
		System.out.println("Ingrese el valor del nùmero b");
		System.out.println();
		double b=entrada.nextInt();
		System.out.println();
		double suma= a+b;
		double resta= a-b;
		double div= a/b;
		double multi= a*b;
		entrada.close();
		
		if(b!=0) {
			System.out.println("El valor de la sumas es "+ suma);
			System.out.println("El valor de la resta es "+ resta);
			System.out.println("El valor de la multiplicación es "+ multi);
			
		}
		
		if(b==0) {
			System.out.println("El valor de la sumas es "+ suma);
			System.out.println("El valor de la resta es "+ resta);
			System.out.println("El valor de la multiplicación es "+ multi);
			System.out.println("No se puede dividir por 0");
		}
		else {
			System.out.println("El valor de la división es "+div );
		}
		

	}

}
