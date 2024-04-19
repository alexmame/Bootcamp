package Ejercicios.java;

import java.util.Scanner;

public class ban {

    public static final String ANSI_BLACK_BG = "\u001B[40m";
    public static final String ANSI_RED_BG = "\u001B[41m";
    public static final String ANSI_GREEN_BG = "\u001B[42m";
    public static final String ANSI_YELLOW_BG = "\u001B[43m";
    public static final String ANSI_BLUE_BG = "\u001B[44m";
    public static final String ANSI_PURPLE_BG = "\u001B[45m";
    public static final String ANSI_CYAN_BG = "\u001B[46m";
    public static final String ANSI_WHITE_BG = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final StringBuilder FLAG = new StringBuilder();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        rowsAndColumns();
        printFlag();
    }

    public static void rowsAndColumns() {
        System.out.println("Cuantos pixeles de altura quieres?");
        int rows = sc.nextInt();
        System.out.println("Cuantas columnas quieres que tenga la bandera?");
        int cols = sc.nextInt();
        sc.nextLine();
        buildFlagStructure(rows, cols);
    }

    public static void buildFlagStructure(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Row " + (i+1) + ", Column " + (j+1) + ": ");
                FLAG.append(askColor()).append("  ").append(ANSI_RESET);
            }
            FLAG.append("\n");
        }
    }

    public static String askColor() {
        System.out.println("Elige una opción de color de fondo (1= Rojo, 2= Verde, 3= Azul, 4= Amarillo, 5= Lila, 6= Cyan, 7= Blanco, 8= Negro): ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        switch (choice) {
            case 1:
                return ANSI_RED_BG;
            case 2:
                return ANSI_GREEN_BG;
            case 3:
                return ANSI_BLUE_BG;
            case 4:
                return ANSI_YELLOW_BG;
            case 5:
                return ANSI_PURPLE_BG;
            case 6:
                return ANSI_CYAN_BG;
            case 7:
                return ANSI_WHITE_BG;
            case 8:
                return ANSI_BLACK_BG;
            default:
                System.out.println("Elección no válida, se utiliza el color de fondo predeterminado Negro.");
                return ANSI_BLACK_BG;
        }
    }

    public static void printFlag() {
        System.out.println(FLAG.toString());
    }
}