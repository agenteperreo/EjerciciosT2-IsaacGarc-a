package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 *horas=14, min=69, seg=20 --> "No valido
		 *horas=23, min=59, seg=59 --> "0:0.0"
		 *horas=6, min=46, seg=59  --> "6:47.0"
		 *horas=19, min=59, seg=59 --> "20:0.0"
		 *horas=10, min=23, seg=39 --> "10:23.40"
		*/
		
		// Declaramos la variables
		int horas, min, seg; //Horas, minutos y segundos

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos las horas
		System.out.print("Horas: ");
		horas = sc.nextInt();
		// pedimos los minutos
		System.out.print("Minutos: ");
		min = sc.nextInt();
		// Pedimos los segundos
		System.out.print("Segundos: ");
		seg = sc.nextInt();

		// Le sumamos 1 a los segundos
		seg++;

		if (horas > 24 || min > 61 || seg > 61) { //Si las horas son >24, los minutos > 61 o los segundos > 61, no es valido
			System.out.println("No valido");
		} else { //Si no, comprobamos los siguientes casos
			if (seg == 60) { //Si los segundos son 60
				min++; //Sumamos 1 minuto
				seg = 0; //Igualamos los segundos a 0
			}
			if (min == 60) { //si los minutos son 60
				horas++; //Aumentamos una hora
				min = 0; //Igualamos los minutos a 0
			}
			if (horas == 24) { //Si la hora es igual a 24
				horas = 0;
			}
			
			//Mostramos las horas los minutos y los segundos en el formato adecuado
			System.out.printf("%d:%d.%d", horas, min, seg);
		}

		

		// Cerramos el escaner
		sc.close();

	}

}
