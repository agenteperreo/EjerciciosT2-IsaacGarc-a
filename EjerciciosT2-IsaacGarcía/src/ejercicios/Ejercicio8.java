package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaramos las variables
		int distancia, estancia;
		final double precio = 2.5;
		double descuento, total;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la distancia que recorrera
		System.out.print("¿Cuantos km vas a recorrer en el viaje?: ");
		distancia = sc.nextInt();
		// Pedimos la estancia
		System.out.print("¿Cuantos dias vas a instanciarte?: ");
		estancia = sc.nextInt();

		// Calculo el precio total del viaje
		total = distancia * precio;

		if (distancia > 800 && estancia > 7) { //Si la distancia es mayor a 800 y la estancia mayor a 7
			descuento = total * 0.3; //calculamos un 30% de descuento respecto al total
			total -= descuento; //Le restamos el descuento al total
			System.out.println(
					"Ya que la distancia del viaje es mayor a 800km y la estancia mayor a 7 dias, se le ha hecho un 30% de descuento.\n El total de su viaje es: "
							+ total);
			//Mostramos que se ha descuentado un 30% y mostramos el total del viaje
		} else { //Si no, el precio total no cambiaria
			System.out.printf("El total del viaje es: %.2f", total); //Lo mostramos
		}

		// Cerramos el escaner
		sc.close();
	}

}
