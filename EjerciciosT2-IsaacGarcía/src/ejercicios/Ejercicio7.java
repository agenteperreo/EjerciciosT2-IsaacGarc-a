package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaramos la variables
		int horas, min, seg;

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
			
			System.out.printf("%d:%d.%d", horas, min, seg);
		}

		

		// Cerramos el escaner
		sc.close();

	}

}
