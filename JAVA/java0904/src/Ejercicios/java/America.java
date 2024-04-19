package Ejercicios.java;

public class America {
	public void mostrarBanderaAmerica() {

		String rojo = "\u001B[41m";
		String blanco = "\033[47m \033[0m";
		String azul = "\u001B[34m";
		String reset = "\u001B[0m";

		for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 20; j++) {
                if (j < 9) {
                    if (j % 2 == 0) {
                        System.out.print(azul + "  " + reset);
                    } else {
                        System.out.print(blanco + "  " + reset);
                    }
                } else {
                    System.out.print(rojo + "  " + reset);
                }
            }
            System.out.println();
        }

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(blanco + "  " + reset);
			}
			System.out.println();
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(rojo + "  " + reset);
			}
			System.out.println();
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(blanco + "  " + reset);
			}
			System.out.println();

		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(rojo + "  " + reset);
			}
			System.out.println();
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(blanco + "  " + reset);
			}
			System.out.println();

		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(rojo + "  " + reset);
			}
			System.out.println();
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(blanco + "  " + reset);
			}
			System.out.println();

		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(rojo + "  " + reset);
			}
			System.out.println();
		}

	}

}
