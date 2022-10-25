package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 * num=-7 --> 7
		 *num=3 --> 3
		*/
		
		//Declaramos las variables
		int num;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero al usuario
		System.out.print("Dime un numero y te dire su valor absoluto: ");
		num = sc.nextInt();
		
		//Ternario para saber el valor absoluto
		num = num<0 ? -num : num;
		
		//Mostramos el numero con valor absoluto
		System.out.printf("El numero en valor absoluto es: %d",num);
		
		//Cerramos el escaner
		sc.close();

	}

}
