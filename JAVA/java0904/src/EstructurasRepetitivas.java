public class EstructurasRepetitivas {
	public static void main(String[] args) {

		int limiteInferior = 0; // Límite inferior del rango
		int limiteSuperior = 10; // Límite superior del rango

		System.out.println("Números divisibles por 2 en el rango de " + limiteInferior + " a " + limiteSuperior + ":");

		// Iterar a través del rango
		for (int numero = limiteInferior; numero <= limiteSuperior; numero++) {
			// Verificar si el número es divisible por 2
			if (numero % 2 == 0) {
				System.out.println(numero); // Mostrar el número si es divisible por 2
			}
		}

	}
}