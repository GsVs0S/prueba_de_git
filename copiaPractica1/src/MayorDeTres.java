// Jesus Lopez Corvalan
/**
 /**
 * MayorDeDos.java
 * Programa ejemplo que lee tres números y que escribe el mayor de los tres.
 */

import java.util.Scanner;
public class MayorDeTres
{
	public static void main(String argumentos[]){

		Scanner teclado = new Scanner(System.in);
		
		String num = "" ;				
		String num2 = "";
		String num3 = "";
		
		System.out.println("Hola.");
		System.out.print("Dime tres números y te diré cuál es el mayor de los tres\n");

		System.out.print("\nDíme el primer número: ");
		
		num = teclado.nextLine();
		
		System.out.print("\nDíme el segundo: ");
		
		num2 = teclado.nextLine();
		
		System.out.print("\nDíme el tercero: ");
		
		num3 = teclado.nextLine();
		
		int numr = Integer.parseInt(num);
		int numr2 = Integer.parseInt(num2);
		int numr3 = Integer.parseInt(num3);
		
		//condiciones para que muestre el numero que es mayor
		
		if(numr > numr2)
	           if(numr>numr3)
	              System.out.println("El mayor es: " + numr);
	           else
	              System.out.println("el mayor es: " + numr3);
	        	else if(numr2>numr3)
	              System.out.println("el mayor es: " + numr2);
	                else
	              System.out.println("el mayor es: " + numr3);
	}
}