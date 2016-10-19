// Jesus Lopez Corvalan
/**
 /**
 * Nombre1.java
 * Programa ejemplo que que pide edad y nombre a dos personas y 
 * muestra como resultado un mensaje personalizado.
 */
import java.util.Scanner;
public class Nombre1
{
	public static void main(String argumentos[]){
		
		Scanner teclado = new Scanner(System.in);
		
		String edad = "";				// variable numérica
		String nombre = "";		// variable de texto 
		String edad1 = "";				// variable numérica
		String nombre1 = "";		// variable de texto
		
		// configura y muestra mensaje de bienvenida
		
		System.out.println("Hola. ");
		System.out.print("soy un programa de ordenador...\n");
		System.out.println("Diganme sus nombres y edad en orden, por favor :).");

		// Pide el primer nombre y edad
		System.out.print("\nDíme tu nombre: ");
		
			nombre = teclado.nextLine();
			
		System.out.print("\nDíme tu edad " + nombre + ":");
		
			edad = teclado.nextLine();
			
		// Pide el segundo nombre y edad// Pide el primer nombre y edad	
		System.out.print("\nDíme tu nombre: ");
			
			nombre1 = teclado.nextLine();
			
		System.out.print("\nDíme tu edad " + nombre1 + ":");
		
			edad1 = teclado.nextLine();
		//pasa de string a int
		int edadr = Integer.parseInt(edad);
		int edadr1 = Integer.parseInt(edad1);
		// suma las edades
		int suma = edadr +edadr1 ;
		
		// muestra mensaje personalizado
		System.out.println("\nBienvenidos " + nombre + "y" + nombre1 + "entre los dos sumáis " + suma + " años");
		
	}

}