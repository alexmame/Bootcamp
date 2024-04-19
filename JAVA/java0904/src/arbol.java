public class arbol {
    public static void main(String[] args) {
        int altura = 10;
        
        String verde = "\u001B[42m";
        String marron = "\u001B[43m";
        String reset = "\u001B[0m";
        
        for (int nivel = 0; nivel < altura; nivel++) {
            for (int espacio = altura - nivel; espacio > 0; espacio--) {
                System.out.print(" ");
            }
            
            System.out.print(verde);
            for (int asterisco = 0; asterisco < 2 * nivel + 1; asterisco++) {
                System.out.print("*");
            }
            System.out.print(reset);
            
            System.out.println();
        }
        
        for (int tronco = 0; tronco < 3; tronco++) {
            for (int espacio = altura - 1; espacio > 0; espacio--) {
                System.out.print(" ");
            }
            System.out.print(marron);
            System.out.println("***" + reset);
        }
    }
}
