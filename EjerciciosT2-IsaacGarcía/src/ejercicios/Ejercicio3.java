package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*kilosComprados=300, numA=0, kilosDiarios=150 --> "El numero de animales es incorrecto"
		 *kilsoComprados=300, numA=2, kilosDiarios=250 --> "Tienes suficiente comida para los animales"
		 *kilosComprados=250, numA=3, kilosDiarios=300 --> "No tienes suficiente comida para los animales"
		 *												   "A cada animal le corresponderia 83,33kg de comida"*/

		// Declaramos las variables
		int numA;
		double kilosComprados, kilosDiarios, cantidadNecesaria;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos cuanta cantidad de comida a comprado
		System.out.print("Kilos de comida comprados: ");
		kilosComprados = sc.nextDouble();

		// Pedimos la cantidad de animales que van a comer
		System.out.print("cantidad de animales que van a comer: ");
		numA = sc.nextInt();

		// Pedimos la media de kilos de comida diaria por animal
		System.out.print("Cuantos kilos diarios consumen los animales: ");
		kilosDiarios = sc.nextDouble();

		if (numA<=0) { //Si el numero de animales es menor o igual que 0, no se podria seguir el programa
			System.out.println("El numero de animales es incorrecto"); //Mostramos que es incorrecto
		} else { //Si no continuamos
			if (kilosComprados>=kilosDiarios) { //Si los kg de comida comprados es mayor o igual a los kilos que consumen los animales
				System.out.println("Tienes suficiente comida para los animales"); //Mostramos que tienen suficiente comida
			} else { //Si el numero de kilos comprados es menor al de los kilos que consumen los animales
				System.out.println("No tienes suficiente comida para los animales"); //Mostramos que no es suficiente comida para los animales
				cantidadNecesaria=kilosComprados/(double)numA; //Calculamos cuantos kilos corresponde a cada animal
				System.out.printf("A cada animal le corresponderia %.2fkg de comida",cantidadNecesaria); //Lo mostramos
			}
		}

		// Cerramos el escaner
		sc.close();

	}

}
