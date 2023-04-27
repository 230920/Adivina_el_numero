import java.util.Random;
import java.util.Scanner; //importamos librerias 
//Creamos la clase AdivinarNumero que contendrá el método main que es el punto de entrada del programa.
public class AdivinarNumero {

    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        Random random = new Random(); //Random que se utilizará para generar el número aleatorio
        int numero = random.nextInt(100) + 1; //La función nextInt(100) genera un número aleatorio entre 0 y 99, por lo que le sumamos 1 para que esté dentro del rango de 1 a 100.

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes 10 intentos para adivinar el número generado.");

        // Pedir al usuario que adivine el número
        Scanner scanner = new Scanner(System.in); // Scanner que se utilizará para leer la entrada del usuario
        int intentos = 10;
        while (intentos > 0) {
            System.out.print("Introduce un número entre 1 y 100: ");
            int adivinanza = scanner.nextInt();

            // Comprobar si el número adivinado es igual al número generado
            if (adivinanza == numero) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                break;
            } else {
                intentos--;
                System.out.println("Lo siento, ese no es el número. Te quedan " + intentos + " intentos.");

                // Decir si el número adivinado es mayor o menor que el número generado
                if (adivinanza < numero) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            }
        }

        // Si se han agotado los intentos, mostrar el número generado
        if (intentos == 0) {
            System.out.println("Lo siento, has agotado todos los intentos. El número era " + numero + ".");
        }
    }
}