package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*Introduzco 16378 y me devuelve que el numero no es valido
		 *Introduzco 5 y me devuelve que el numero es capicua
		 *Introduzco 19 y me devuelve que el numero no es capicua
		 *Introduzco 77 y me devuelve que el numero es capicua
		 *Introduzco 410 y me devuelve que el numero no es capicua
		 *Introduzco 929 y me devuelve que el numero es capicua
		 *Introduzco 8451 y me devuelve que el numero no es capicua
		 *Introduzco 3003 y me devuelve que el numero es capicua*/
		
		// Declaramos las variables
		int num, milesima, centesima, decima, unidad;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.print("Dime un numero entre 0 y 9999 y te dire si es capicua: ");
		num = sc.nextInt();

		// Comprobamos que esté entre esos numeros
		if (num < 1 || num > 9999) { //Si el numero es menor que 1 y mayor que 9999 no es valido
			System.out.println("El numero no es valido");
		} else if (num >= 1 && num < 10) { //si el numero unicamente tiene una cifra es capicua
			System.out.println("El numero es capicua");
		} else if (num >= 10 && num < 100) { //sie el numero tiene 2 cifras
			decima = (int) (num / 10); //Dividimos entre 10 y sacamos la parte entera, mediante un casting, que es la primera cifra
			unidad = num % 10; //El resto del numero entre 10 es la segunda cifra
			if (decima == unidad) { //Si las 2 cifras son iguales, es un numero capicua
				System.out.println("El numero es capicua");
			} else { //Si no, no es capicua
				System.out.println("El numero no es capicua");
			}
		} else if (num >= 100 && num < 1000) { //Si el numero tiene 3 cifras
			centesima = (int) (num / 100); //Dividimos entre 100 y sacamos la parte entera, mediante un casting, que es la primera cifra
			unidad = num % 10; //El resto del numero entre diez es la tercera cifra
			if (centesima == unidad) { //Si la primera y la tercera cifra son iguales es capicua
				System.out.println("El numero es capicua");
			} else { //Si no, no es capicua
				System.out.println("El numero no es capicua");
			}
		} else { //Si no se cumple ninguno de los casos anteriores tiene 4 cifras
			milesima = (int) (num / 1000); //Dividimos entre 1000 y sacamos la parte entera, mediante un casting, que es la primera cifra
			centesima = (int) (num / 100) % 10; //Dividimos entre 100 y sacamos la parte entera y esa parte entera le hacemos el modulo de 10 y nos dará la segunda cifra
			decima = (int) (num / 10) % 10; //Dividimos entre 10 y sacamos la parte entera y esa parte entera le hacemos el modulo de 10 y nos dará la tercera cifra
			unidad = num % 10; //Hacemos el modulo de
			if (milesima == unidad && centesima == decima) { //Si la primera y cuarta cifra y la sgunda y tercera cifra son iguales, es un numero capicua
				System.out.println("El numero es capicua");
			} else { //si no, no es capicua
				System.out.println("El numero no es capicua");
			}
		}

		//Cerramos el escaner
		sc.close();

	}

}
