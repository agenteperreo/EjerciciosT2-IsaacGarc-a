package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

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

		if (numA <= 0) {
			System.out.println("La cantidad de animales es invalida");
		} else {
			cantidadNecesaria = numA * kilosDiarios;
			if (cantidadNecesaria > kilosComprados) {
				cantidadNecesaria = kilosComprados/numA;
				System.out.println("La cantidad comprada es insuficiente");
				System.out.printf("Para que todos los animales coman lo mismo cada animal, comerían %.2fkg",cantidadNecesaria);
			} else {
				cantidadNecesaria = kilosDiarios*numA;
				cantidadS = kilosComprados-cantidadNecesaria;
				System.out.printf("Todos los animales podrian comer su ración, e incluso sobrarian %.2fkg",cantidadS);
			}
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
