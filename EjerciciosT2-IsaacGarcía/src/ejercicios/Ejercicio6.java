package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		int num1, num2, resU, resT;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Sacamos los 2 numeros aleatorios
		num1 = (int)(Math.random()*99);
		num2 = (int)(Math.random()*99);
		
		//Pedimos la suma de los 2 numeros
		System.out.printf("¿Cuanto es %d+%d?",num1, num2);
		resU = sc.nextInt();
		
		//Calculamos el resultado de la suma
		resT = num1+num2;
		
		if (resT == resU) { //Si el resultado dicho por el usuario es igual al resultado real a adivinado
			System.out.println("Enhorabuena sabes sumar, maquina");
		} else { //si no es igual no a adivinado
			System.out.println("Te quivocaste, vuelve a primaria");
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
