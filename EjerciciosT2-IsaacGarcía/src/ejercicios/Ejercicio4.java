package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 *num=11 --> "El numero escrito es once"
		 *num=76 --> "El numero escrito es setenta y seis"
		 *num=5 --> "El numero escrito es cinco"
		 *num=16 --> "El numero escrito es dieciseis"
		 *num=30 --> "El numero escrito es treinta"
		 *num=99 --> "El numero escrito es noventa y nueve"
		 *num=0 --> "El numero introducido no esta en los parametros marcados."
		*/
		
		int num; //Numero introducido por el usuario
		int cifra1; //Cifra 1
		int cifra2; //Cifra 2
		String c1E; //Cifra 1 Escrita
		String c2E; //Cifra 2 Escrita
		
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
		
			case 1 -> { //Si cifra2 es 1 la variable c2E es "uno"
				yield "uno";
				}
			
			case 2 -> { //Si cifra2 es 2 la variable c2E es "dos"
				yield "dos";
				}
			
			case 3 -> { //Si cifra2 es 3 la variable c2E es "tres"
				yield "tres";
				}
			
			case 4 -> { //Si cifra2 es 4 la variable c2E es "cuatro"
				yield "cuatro";
				}
			
			case 5 -> { //Si cifra2 es 5 la variable c2E es "cinco"
				yield "cinco";
				}
			
			case 6 -> { //Si cifra2 es 6 la variable c2E es "seis"
				yield "seis";
				}
			
			case 7 -> { //Si cifra2 es 7 la variable c2E es "siete"
				yield "siete";
				}
			
			case 8 -> { //Si cifra2 es 8 la variable c2E es "ocho"
				yield "ocho";
				}
			
			case 9 -> { //Si cifra2 es 9 la variable c2E es "nueve"
				yield "nueve";
				}
			
			default -> ""; //En caso de no ser ninguno de los anteriores no se escribe nada
		
		};
		
		//switch para saber que escribir en cada caso de la primera cifra
		c1E = switch (cifra1) {
		
			case 1 -> { //Si cifra1 es 1 la variable c2E es "dieci"
				yield "dieci";
				}
			
			case 2 -> { //Si cifra1 es 2 la variable c2E es "veinti"
				yield "veinti";
				}
			
			case 3 -> { //Si cifra1 es 3 la variable c2E es "treinta y"
				yield "treinta y ";
				}
			
			case 4 -> { //Si cifra1 es 4 la variable c2E es "cuarenta y"
				yield "cuarenta y ";
				}
			
			case 5 -> { //Si cifra1 es 5 la variable c2E es "cicuenta y"
				yield "cincuenta y ";
				}
			
			case 6 -> { //Si cifra1 es 6 la variable c2E es "sesenta y"
				yield "sesenta y ";
				}
			
			case 7 -> { //Si cifra1 es 7 la variable c2E es "setenta y"
				yield "setenta y ";
				}
			
			case 8 -> { //Si cifra1 es 8 la variable c2E es "ochenta y"
				yield "ochenta y ";
				}
			
			case 9 -> { //Si cifra1 es 9 la variable c2E es "noventa y"
				yield "noventa y ";
				}
			
			default -> ""; //Si no es ninguna de las anteriores no se escribe nada
		
		};
		
		if (num < 1 || num > 99) { //Si el numero es menor que 1 o mayor que 99 no es valido
			
			System.out.println("El numero introducido no esta en los parametros marcados."); //Mostramos que el numero no es valido
			
		} else if (num > 10 && num < 16 || cifra2 == 0) { //si el numero es mayor que 10 y menor que dieceisei, o la segunda cifra equivalente a 0
			
			switch (num) { //Switch para casos en especifico
			
				case 10 -> System.out.println("El numero escrito es diez"); //Si el numero es 10, escribimos "diez"
				
				case 11 -> System.out.println("El numero escrito es once"); //Si el numero es 11, escribimos "once"
				
				case 12 -> System.out.println("El numero escrito es doce"); //Si el numero es 12, escribimos "doce"
				
				case 13 -> System.out.println("El numero escrito es trece"); //Si el numero es 13, escribimos "trece"
				
				case 14 -> System.out.println("El numero escrito es catorce"); //Si el numero es 14, escribimos "catorce"
				
				case 15 -> System.out.println("El numero escrito es quince"); //Si el numero es 15, escribimos "quince"
				
				case 20 -> System.out.println("El numero escrito es veinte"); //Si el numero es 20, escribimos "veinte"
				
				case 30 -> System.out.println("El numero escrito es treinta"); //Si el numero es 30, escribimos "treinta"
				
				case 40 -> System.out.println("El numero escrito es cuarenta"); //Si el numero es 40, escribimos "cuarenta"
				
				case 50 -> System.out.println("El numero escrito es cincuenta"); //Si el numero es 50, escribimos "cincuenta"
				
				case 60 -> System.out.println("El numero escrito es sesenta"); //Si el numero es 60, escribimos "sesenta"
				
				case 70 -> System.out.println("El numero escrito es setenta"); //Si el numero es 70, escribimos "setenta"
				
				case 80 -> System.out.println("El numero escrito es ochenta"); //Si el numero es 80, escribimos "ochenta"
				
				case 90 -> System.out.println("El numero escrito es noventa"); //Si el numero es 90, escribimos "noventa"
			
			}
			
		} else if (num < 10) { //Si el numero es menor que diez cogemos solo la segunda cifra escrita
				
			System.out.printf("El numero escrito es %s",c2E); //Mostramos el numero escrito
			
		} else if (num > 10) { //Si el numero es mayo que diz concatenamos la primera y la segunda cifra escrita
			
			System.out.printf("El numero escrito es %s%s",c1E,c2E); //Mostramos el numero escrito
			
		}
		
		//Cerramos el escaner
		sc.close();
		
		

	}

}
