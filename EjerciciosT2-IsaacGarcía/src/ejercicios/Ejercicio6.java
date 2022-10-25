package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num1=68, num2=50, resU=118, resT=118 --> "Enhorabuena sabes sumar"
		 *num1=62, num2=71, resU=134, resT=133 --> "Te quivocaste, vuelve a primaria"
		*/
		
		//Declaramos las variables
		int num1; //Primer numero  
		int num2; //Segundo numero
		int resU; //Respuesta del usuario
		int resT; //Respuesta real
		
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
			System.out.println("Enhorabuena sabes sumar");
		} else { //si no es igual no a adivinado
			System.out.println("Te quivocaste, vuelve a primaria");
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
