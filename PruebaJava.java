import java.util.Scanner;

public class PruebaJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Hola! Vamos a probar Java.");
        System.out.print("Escribe tu nombre: ");

        String nombre = sc.nextLine();

        System.out.println("¡Hola " + nombre + "! Tu Java funciona correctamente.");

        sc.close();
    }
}
