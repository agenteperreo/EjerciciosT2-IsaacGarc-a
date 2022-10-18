package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos las variables
		int num, milesima, centesima, decima, unidad;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.print("Dime un numero entre 0 y 9999 y te dire si es capicua: ");
		num = sc.nextInt();

		// Comprobamos que esté entre esos numeros
		if (num < 1 || num > 9999) {
			System.out.println("El numero no es valido");
		} else if (num >= 1 && num < 10) {
			System.out.println("El numero es capicua");
		} else if (num >= 10 && num < 100) {
			decima = (int) (num / 10);
			unidad = num % 10;
			if (decima == unidad) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else if (num >= 100 && num < 1000) {
			centesima = (int) (num / 100);
			unidad = num % 10;
			if (centesima == unidad) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else {
			milesima = (int) (num / 1000);
			centesima = (int) (num / 100) % 10;
			decima = (int) (num / 10) % 10;
			unidad = num % 10;
			if (milesima == unidad && centesima == decima) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		}

		sc.close();

	}

}
