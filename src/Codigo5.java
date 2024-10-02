/*
 * Este código permite determinar si los digitos de un número son números afortunados
 * (3,7,8 o 9) o si son números no afortunados
 * */

import java.util.Scanner;

public class Codigo5 {
	
	// Se crea el método main
		public static void main(String[] args) {
			// Se agrega salida estándar y se incluye Scanner
		    Scanner s = new Scanner(System.in);
		    System.out.print("Introduzca un número: ");
		    // Se suprime la variable ni y ahora c recibe enteros
		    int c = s.nextInt();
		    int afo = 0;
		    int noAfo = 0;
		    
		    // Se cambian las referencias de ni a c
		    while (c > 0) {
			  int digito = (int)(c % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
			    c /= 10;
		      }
		    if (afo > noAfo) {
		    	// Se completa la instrucción de system.out.println
		      System.out.println("El " + c + " es un número afortunado.");
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		    }
		    
		  }
		}
		
}
	  