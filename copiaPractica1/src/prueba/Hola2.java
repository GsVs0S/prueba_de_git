package prueba;

/**
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Hola2
{
    public static void main(String argumentos[]) {
        
        //
        //
        Scanner teclado = new Scanner(System.in);

        int num ;               // 
        String nombre = "";     // 

        // 
        num = 1 ;
        System.out.println("Hola, Soy un modesto ");
        System.out.print("programa de ordenador...\n");
        System.out.println("Mi número de orden es el " + num + " por ser el primero.");

        // 
        System.out.println("Escribe dos números...\n");
        int dato1 = teclado.nextInt();
        int dato2 = teclado.nextInt();

        // 
        System.out.println("Dato1: " + dato1);
        System.out.println("Dato2: " + dato2);

        // 
        String mensaje = "";

        if (dato1 == dato2) {
            mensaje = "Ninguno de los dos es mayor... ";
        }

        if (dato1 > dato2) {
            mensaje = "El mayor es: " + dato1;
        }

        if (dato2 > dato1) {
            mensaje = "El mayor es: " + dato2;
        }

        System.out.println(mensaje);
    }

}