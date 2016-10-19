//[Jesús López Corvalán]

/**
 * Literas2.java
 * Programa ejemplo adaptacion del programa del ejercicio anterior para utilizar tipos de dato envoltorio (Wrapper) de Java.
 */

public class Literal2{ // encabezado de la clase
		public static void main(String argumentos[]){ //encabezado del método
			
			Double num = -11.1;
			Double num1 = -88.28;
			Double num3 = .3e27;
			//Double num4 = 23e2.3;	
			String word = "cañón";
			Integer num4 = 0337;
			//Integer num5 = 099;
			Integer num6 = 9999;
		    Double num7 = +521.6;
		    Double num8 = 1.26;
		    Double num9 = 5E-002;
		    Integer num10 = 0xFE;
		    Integer num11 = 0b101010;
		    //Double num12 = 1.26f;
		    Character word1 = '\n';
		    // String nam1 = while;
		    //Character num13 = \xFE
		    Integer num13 = 1234;
		    Double num14 = .567;
		    Integer num15 = 0xFFFE;
		    //String word2 = XGA;
		    String word3 = "a";
		    Character word4 = 'a';
		    //Character word5 = 'abc';
		    Double num17 = 02.45;
		    Character word6 = 'a';
		    //Integer num16 = xF2E;
		    Integer num18 = 0xf;
		    //String word7 = ab"c;
		    //String word8 = "abc;
		    //String word9 = "abc';
		    String word10 = "abc;";
		    //String word11 = "abc"";
		    //String word12 = ""abc"";
		    
		    Double dato = new Double (-11.1);
		    		    
		    System.out.println("varibles relacionados con cálculos númericos:\n" + num + "\n" + num1 + "\n" + num3 + "\n" + num6 + "\n" + num7 + 
		    				"\n" + num8 + "\n" + num9 + "\n" + num10 + "\n" + num11 + "\n" + num13 + "\n" + num15 + "\n" + num17 + "\n" + num18 + "\n" + dato + "\n" + "\n");
		    System.out.println("varibles relacionados con texto y caracteres:\n" + word + "\n" + word1 + "\n" + word3 + "\n" + word4 + "\n" + word6 + "\n" + word10);
	}

} 

