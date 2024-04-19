package Ejercicios.java;

public class Espana {
    static String rojo = "\u001B[41m";
    static String amarillo = "\u001B[43m";
    static String reset = "\u001B[0m";

    public void mostrarBanderaEspaña() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(rojo + "  " + reset);
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(amarillo + "  " + reset);
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(rojo + "  " + reset);
            }
            System.out.println();
        }
    }
}
