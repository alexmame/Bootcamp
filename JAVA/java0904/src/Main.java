import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre, apellido, calle, municipio, correoElectronico;
        int codigoPostal;
        char sexo;

        System.out.println("Por favor, ingresa tu nombre:");
        nombre = scanner.nextLine();

        System.out.println("Por favor, ingresa tu apellido:");
        apellido = scanner.nextLine();

        System.out.println("Por favor, ingresa tu calle:");
        calle = scanner.nextLine();

        System.out.println("Por favor, ingresa tu municipio:");
        municipio = scanner.nextLine();

        codigoPostal = leerCodigoPostal(scanner);

        sexo = leerSexo(scanner);

        System.out.println("Por favor, ingresa tu correo electrónico:");
        correoElectronico = scanner.next();

        String datosConcatenados = "Nombre: " + nombre + "\n" +
                                   "Apellido: " + apellido + "\n" +
                                   "Calle: " + calle + "\n" +
                                   "Municipio: " + municipio + "\n" +
                                   "Código Postal: " + codigoPostal + "\n" +
                                   "Sexo: " + sexo + "\n" +
                                   "Correo Electrónico: " + correoElectronico;

        System.out.println("\nLos datos ingresados son:\n" + datosConcatenados);

        scanner.close();
    }

    public static int leerCodigoPostal(Scanner scanner) {
        System.out.println("Por favor, ingresa tu código postal:");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Por favor, ingresa un código postal válido (número entero).");
            scanner.nextLine(); // Limpiar el buffer del scanner
            return leerCodigoPostal(scanner); // Llamada recursiva para volver a solicitar el código postal
        }
    }

    public static char leerSexo(Scanner scanner) {
        System.out.println("Por favor, ingresa tu sexo (M/F):");
        char sexo = Character.toUpperCase(scanner.next().charAt(0)); // Leer un solo carácter y convertirlo a mayúscula
        if (sexo == 'M' || sexo == 'F') {
            return sexo;
        } else {
            System.out.println("Error: Por favor, ingresa 'M' para masculino o 'F' para femenino.");
            return leerSexo(scanner); // Llamada recursiva para volver a solicitar el sexo
        }
    }
}