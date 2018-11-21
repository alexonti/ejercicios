package ejercicios;
import java.util.*;
public class guias5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Calcular cuadrado y raíz cuadrada");
		System.out.println();

		System.out.println("Ingrese un número entero");
		double a=entrada.nextDouble();
		double potencia= a*a;
		double raiz= Math.sqrt(a);
		System.out.println();
		
		entrada.close();

	
		if(a<=0){
			System.out.println("No se puede determinar");
		}
		
		else{
			System.out.println("Del número "+a);
			System.out.println("Su potencia es "+ potencia);
			System.out.println("Su raíz cuadrada es "+ raiz);

		}
		
		

	}

}
