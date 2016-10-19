// Jesus Lopez Corvalan
/**
 /**
 * MayorDeDos.java
 * Programa ejemplo que lee dos números y que escribe el mayor de los dos.
 */

import java.util.Scanner;
public class MayorDeDos
{
	public static void main(String argumentos[]){

		Scanner teclado = new Scanner(System.in);
		
		String num = "" ;				
		String num2 = "";
		
		System.out.println("Hola.");
		System.out.print("Dime dos números y te diré cuál es el mayor de los dos\n");

		System.out.print("\nDíme el primer número: ");
		
		num = teclado.nextLine();
		
		System.out.print("\nDíme el segundo: ");
		
		num2 = teclado.nextLine();
		
		int numr = Integer.parseInt(num);
		int numr2 = Integer.parseInt(num2);
		
		//condiciones para que muestre el numero que es mayor
		if (numr>numr2){
				
			System.out.println( numr + " es el mayor de los dos");
		} 
	
		else{
			
			if (numr2>numr){
			
				System.out.println( numr2 + " es el mayor de los dos");
			} 
		}
		
	}

}