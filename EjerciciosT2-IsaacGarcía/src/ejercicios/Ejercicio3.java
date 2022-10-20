package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables
		int numA;
		double kilosComprados, kilosDiarios, cantidadNecesaria, cantidadS;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos cuanta cantidad de comida a comprado
		System.out.print("Kilos de comida comprados: ");
		kilosComprados = sc.nextDouble();

		// Pedimos la cantidad de animales que van a comer
		System.out.print("cantidad de animales que van a comer: ");
		numA = sc.nextInt();

		// Pedimos la media de kilos de comida diaria por animal
		System.out.print("Cuantos kilos diarios consume cada animal: ");
		kilosDiarios = sc.nextDouble();

		// Si el numero de animales es 0 o menor no es valido
		if (numA <= 0) {
			System.out.println("La cantidad de animales es invalida");
		} else { // Si el numero de animales es mayor que 0 calculamos la cantidad de comida que
					// necesitan los animales
			cantidadNecesaria = numA * kilosDiarios;// Calculo de la cantidad de comida
			if (cantidadNecesaria > kilosComprados) { // Si la cantidad de comida necesaria es mayor que la caomprada
														// entonces la comida es insuficiente
				cantidadNecesaria = kilosComprados / numA; // Calculamos la cantidad de comida proporcional a cada
															// animal
				System.out.println("La cantidad comprada es insuficiente"); // Mostramos por terminal que no hay
																			// suficiente comida
				System.out.printf("Para que todos los animales coman lo mismo cada animal, comerían %.2fkg",
						cantidadNecesaria); // Mostramos la cantidad que corresponderia a cada animal
			} else { //Si la comida es sufiente
				cantidadNecesaria = kilosDiarios * numA; //Calculamos cuanta comida necesitaran los animales
				cantidadS = kilosComprados - cantidadNecesaria; //Calculamos cuantos kg de comida sobran
				System.out.printf("Todos los animales podrian comer su ración, e incluso sobrarian %.2fkg", cantidadS);
				//Mostramos que hay suficiente comida y cuanta comida sobra
			}
		}

		// Cerramos el escaner
		sc.close();

	}

}
