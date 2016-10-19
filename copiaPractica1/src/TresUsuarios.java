// Jesus Lopez Corvalan

//Programa que pide informacion de tres usuarios y los muestra a la inversa



import java.util.Scanner;
public class TresUsuarios
{
	public static void main(String argumentos[]){
	

		Scanner teclado = new Scanner(System.in);
		
		String dni = "" ;			
		String nombre = "";
		String apellidos = "";
		String dir = "";
		String dni2 = "" ;	
		String nombre2 = "";
		String apellidos2 = "";
		String dir2 = "";
		String dni3 = "" ;			
		String nombre3 = "";
		String apellidos3 = "";
		String dir3 = "";
		
		// Pide datos 1
		System.out.print("\nDame tus datos: ");
		
		System.out.print("\n Nombre: ");
				nombre = teclado.nextLine();
		System.out.print("\n Apellidos: ");
				apellidos = teclado.nextLine();
		System.out.print("\n DNI: ");
				dni = teclado.nextLine();
		System.out.print("\n Dirección: ");
				dir = teclado.nextLine();

		// Pide datos 2
		System.out.print("\nDame tus datos: ");
				
		System.out.print("\n Nombre: ");
				nombre2 = teclado.nextLine();
		System.out.print("\n Apellidos: ");
				apellidos2 = teclado.nextLine();
		System.out.print("\n DNI: ");
				dni2 = teclado.nextLine();
		System.out.print("\n Dirección: ");
				dir2 = teclado.nextLine();
				
		// Pide datos 3
		System.out.print("\nDame tus datos: ");
				
		System.out.print("\n Nombre: ");
				nombre3 = teclado.nextLine();
		System.out.print("\n Apellidos: ");
				apellidos3 = teclado.nextLine();
		System.out.print("\n DNI: ");
				dni3 = teclado.nextLine();
		System.out.print("\n Dirección: ");
				dir3 = teclado.nextLine();


				
		// muestra mensaje personalizado
		System.out.println("\n Os mostrare los datos que habéis facilitado empezando por el último");
		System.out.print("\n" + nombre3 + " " + apellidos3 + " con el DNI" + dni3 + " y vive en:\n" + dir3 );
		System.out.print("\n" + nombre2 + " " + apellidos2 + " con el DNI" + dni2 + " y vive en:\n" + dir2 );
		System.out.print("\n" + nombre + " " + apellidos + " con el DNI" + dni + " y vive en:\n" + dir );
	}

}

	
					//hablarlo con el profesor
		//---------------------------------------------------------------------------------------
		//String per1 = nombre + " " + apellidos + " con el DNI" + dni + " y vive en:\n" + dir;
		//String per2 = nombre2 + " " + apellidos2 + " con el DNI" + dni2 + " y vive en:\n" + dir2;
		//String per3 = nombre3 + " " + apellidos3 + " con el DNI" + dni3 + " y vive en:\n" + dir3 ;
		//---------------------------------------------------------------------------------------