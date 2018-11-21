package guias;
import java.util.*;

public class guias3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		//Scanner entrada2=new Scanner(System.in);
		
		System.out.println("Cuál número es mayor?");
		System.out.println();

		System.out.println("Ingrese el valor del número a");
		int a=entrada.nextInt();
		System.out.println();
		System.out.println("Ingrese el valor del nùmero b");
		System.out.println();
		int b=entrada.nextInt();
		System.out.println();
		
		entrada.close();
		
		if(a==b){
			System.out.println("**** Los números son iguales ****");
		}
		
		else{
			
			if(a>b){
				System.out.println("**** a es mayor que b ****");
			}
			if(a<b) {
				System.out.println("**** El b es mayor ****");
			}
		}
	
	}
	
}
			
		
	
		
		//if(a>b);{
				//System.out.println("a es mayor que b");
		//}
		//if(a<b); {
				//System.out.println("b es mayor");
			
			
		
		
			
		
		

		
		
			
		

		
	

	
		
	
	


