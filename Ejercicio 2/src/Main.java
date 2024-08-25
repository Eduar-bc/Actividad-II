import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Se crea una instancia de Scanner para leer la entrada del usuario

        // Solicita al usuario el número de notas que se ingresarán
        System.out.println("ingrese el numero de notas que desea ingresar notas");

        // Lee el número de notas
        int numNotas = scanner.nextInt();
        double[] notas = new double[numNotas];

        // Solicita al usuario cada una de las notas
        for (int i = 0; i < numNotas; i++) {
            System.out.println("ingrese la nota " + (i + 1));
            notas[i] = scanner.nextDouble();
        }

        // Crea una instancia de la clase Notas con el arreglo de notas
        Notas notas1 = new Notas(notas);
        // Muestra la nota mayor
        System.out.println("la nota mayor es: " + notas1.notaMayor());
        // Muestra el porcentaje de notas aprobadas
        System.out.println("El porcentaje de aprobados es: " + notas1.aprobados() + "%");
        // Muestra el promedio de las notas
        System.out.println("El promedio de las notas es: " + notas1.promedio());
        // Muestra la posición de la nota menor
        System.out.println("La nota menor esta en la posicion es : " + notas1.notaMenor());
    }
}

