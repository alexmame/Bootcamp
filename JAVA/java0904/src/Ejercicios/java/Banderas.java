package Ejercicios.java;

import java.util.Scanner;

public class Banderas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcion;
		do {

			System.out.println("-------------------------------------");
			System.out.println("Bienvenido a la Fábrica de Banderas!");
			System.out.println("Por favor, elige una bandera:");
			System.out.println("1. Bandera de Grecia");
			System.out.println("2. Bandera de España");
			System.out.println("3. Bandera de Alemania");
			System.out.println("4. Bandera de Catalunya");
			System.out.println("5. Bandera de Estados Unidos");
			System.out.println("6. Haz tu propia bandera: ");
			System.out.println("7. Salir");
			System.out.println("-------------------------------------");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				
				break;
			case 2:
				Espana e = new Espana();
				e.mostrarBanderaEspaña();
				break;
			case 3:
				Alemania a = new Alemania();
				a.mostrarBanderaAlemania();
				break;
			case 4:
				Catalunya c = new Catalunya();
				c.mostrarBanderaCatalunya();
				break;
			case 5:
				America b = new America();
				b.mostrarBanderaAmerica();
				break;
			case 6:
				Tupropiabandera();
				break;
			case 7:
				System.out.println("¡Hasta luego!");
				break;
			// System.exit(0);
			default:
				System.out.println("Opción no válida. Por favor, elige una opción válida.");
				break;

			}
		} while (opcion != 7);

		scanner.close();
	}

	public static void Tupropiabandera() {

		ban.main(null);
	}
}
