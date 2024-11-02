import java.util.Scanner;

public class HolaMundo { 
    public static void main(String[] args) {

        // Imprimir datos en pantalla / consolta / terminal
        System.out.println("Hola Caro!");
        System.out.println("Cómo va todo?");
        System.out.printf("Aquí va una cadena: %s%n", "Carolina");
        System.out.printf("Aquí va un numero entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Carolina Echeverri",26);

        var entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
        
    }
    
}