import java.util.Scanner;

public class Ejercicio1 {

    
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
    perfectos en un rango
    public static void encontrarNumerosPerfectosEnRango(int inicio, int fin) {
        System.out.println("Números perfectos entre " + inicio + " y " + fin + ":");
        for (int i = inicio; i <= fin; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();

        // Verificar si el número es perfecto
        if (esNumeroPerfecto(numero)) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }
        System.out.print("Ingrese el inicio del rango: ");
        int inicioRango = scanner.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int finRango = scanner.nextInt();

        encontrarNumerosPerfectosEnRango(inicioRango, finRango);

        scanner.close();
    }
}
