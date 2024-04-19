package Ejercicios.java;

public class Alemania {
	
	public void mostrarBanderaAlemania() {

		String negro = "\033[40m \033[0m";
		String rojo = "\u001B[41m";
		String amarillo = "\u001B[43m";
		String reset = "\u001B[0m";

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 40; j++) {
				System.out.print(negro + reset);
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(rojo + "  " + reset);
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(amarillo + "  " + reset);
			}
			System.out.println();
		}
	}
	

}
