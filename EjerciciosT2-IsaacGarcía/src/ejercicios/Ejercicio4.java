package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num; //Numero introducido por el usuario
		int cifra1; //Cifra 1
		int cifra2; //Cifra 2
		String c1E; //Cifra 1 Escrita
		String c2E; //Cifra 2 Escrita
		final String mensaje = "El numero que ha introducido se escribe como ";
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime un numero del 1 al 99: ");
		num = sc.nextInt();
		
		//Calculamos las 2 cifras
		cifra1 = num/10;
		cifra2 = num%10;
		
		//Switch para saber que añadir a los numeros de mas de una cifra o añadirlo en caso de ser cifra unica
		c2E = switch (cifra2) {
		
			case 1 -> {
				yield "uno";
				}
			
			case 2 -> {
				yield "dos";
				}
			
			case 3 -> {
				yield "tres";
				}
			
			case 4 -> {
				yield "cuatro";
				}
			
			case 5 -> {
				yield "cinco";
				}
			
			case 6 -> {
				yield "seis";
				}
			
			case 7 -> {
				yield "siete";
				}
			
			case 8 -> {
				yield "ocho";
				}
			
			case 9 -> {
				yield "nueve";
				}
			
			default -> "";
		
		};
		
		c1E = switch (cifra1) {
		
			case 1 -> {
				yield "dieci";
				}
			
			case 2 -> {
				yield "veinti";
				}
			
			case 3 -> {
				yield "treinta y ";
				}
			
			case 4 -> {
				yield "cuarenta y ";
				}
			
			case 5 -> {
				yield "cincuenta y ";
				}
			
			case 6 -> {
				yield "sesenta y ";
				}
			
			case 7 -> {
				yield "setenta y ";
				}
			
			case 8 -> {
				yield "ochenta y ";
				}
			
			case 9 -> {
				yield "noventa y ";
				}
			
			default -> "";
		
		};
		
		if (num < 1 || num > 99) {
			
			System.out.println("El numero introducido no esta en los parametros marcados.");
			
		} else if (num > 10 && num < 16 || cifra2 == 0) {
			
			switch (num) {
			
				case 10 -> System.out.println(mensaje + "diez");
				
				case 11 -> System.out.println(mensaje + "once");
				
				case 12 -> System.out.println(mensaje + "doce");
				
				case 13 -> System.out.println(mensaje + "trece");
				
				case 14 -> System.out.println(mensaje + "catorce");
				
				case 15 -> System.out.println(mensaje + "quince");
				
				case 20 -> System.out.println(mensaje + "veinte");
				
				case 30 -> System.out.println(mensaje + "treinta");
				
				case 40 -> System.out.println(mensaje + "cuarenta");
				
				case 50 -> System.out.println(mensaje + "cincuenta");
				
				case 60 -> System.out.println(mensaje + "sesenta");
				
				case 70 -> System.out.println(mensaje + "setenta");
				
				case 80 -> System.out.println(mensaje + "ochenta");
				
				case 90 -> System.out.println(mensaje + "noventa");
			
			}
			
		} else if (num < 10) {
				
			System.out.println(mensaje + c2E);
			
		} else if (num > 10) {
			
			System.out.println(mensaje + c1E + c2E);
			
		}
		
		sc.close();
		
		

	}

}
