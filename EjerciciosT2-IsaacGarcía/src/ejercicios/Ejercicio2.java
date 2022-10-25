package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*PRUEBAS
		 *numDni=15370 --> "El numero no es valido"
		 *numDni=48190440 --> N
		 *numDni=53962931 --> D
		 *numDni=77824064 --> E
		*/
		
		// Declaramos la variables
		int numDni, resto;
		char letraDni = ' ';

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero del DNI
		System.out.print("Dime tu numero del DNI: ");
		numDni = sc.nextInt();

		//Si el numero tiene mas o menos de 8 cifras no es valido
		if (numDni > 100000000 || numDni < 10000000) {
			System.out.println("El numero aportado no es valido");
		} else {
			// Hacemos el modulo del numero entre 23 pa saber el resto y asi calculara la
			// letra
			resto = numDni % 23;

			//Dependiendo del valor del resto la letra es uno u otra
			switch (resto) {
			case 0:
				letraDni = 'T';
				break;
			case 1:
				letraDni = 'R';
				break;
			case 2:
				letraDni = 'W';
				break;
			case 3:
				letraDni = 'A';
				break;
			case 4:
				letraDni = 'G';
				break;
			case 5:
				letraDni = 'M';
				break;
			case 6:
				letraDni = 'Y';
				break;
			case 7:
				letraDni = 'F';
				break;
			case 8:
				letraDni = 'P';
				break;
			case 9:
				letraDni = 'D';
				break;
			case 10:
				letraDni = 'X';
				break;
			case 11:
				letraDni = 'B';
				break;
			case 12:
				letraDni = 'N';
				break;
			case 13:
				letraDni = 'J';
				break;
			case 14:
				letraDni = 'Z';
				break;
			case 15:
				letraDni = 'S';
				break;
			case 16:
				letraDni = 'Q';
				break;
			case 17:
				letraDni = 'V';
				break;
			case 18:
				letraDni = 'H';
				break;
			case 19:
				letraDni = 'L';
				break;
			case 20:
				letraDni = 'C';
				break;
			case 21:
				letraDni = 'K';
				break;
			case 22:
				letraDni = 'E';
				break;

			}

			// Mostramos el DNI con su letra
			System.out.printf("El DNI completo es: %d%c", numDni, letraDni);
		}

		// Cerramos el escaner
		sc.close();

	}

}
