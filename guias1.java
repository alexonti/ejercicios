package guias;

import java.util.*;

public class guias1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		Scanner entrada2=new Scanner(System.in);

		System.out.println("Calcula una potencia");
		System.out.println();
	


		System.out.println("Ingrese un numero");
		int numero=entrada.nextInt();
		

		System.out.println("Ingrese una potencia");
		int numero2=entrada2.nextInt();
		int potencia=(int) Math.pow(numero, numero2);
		System.out.println();

		System.out.println("El resultado es: "+potencia );
		
		entrada.close();
		entrada2.close();

		
	}

}
