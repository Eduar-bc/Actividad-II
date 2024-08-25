import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese el número de estaturas que desea procesar
        System.out.println("ingrese el numero de estaturas que desea ingresar");

        // Lee el número de estaturas desde la entrada del usuario
        int numEstaturas = scanner.nextInt();

        // Inicializa un arreglo de tipo double para almacenar las estaturas ingresadas
        double[] estatura = new double[numEstaturas];

        // Bucle para ingresar cada estatura
        for (int i = 0; i < numEstaturas; i++) {
            // Solicita al usuario que ingrese la estatura correspondiente
            System.out.println("ingrese la estatura " + (i + 1));
            // Almacena la estatura ingresada en el arreglo
            estatura[i] = scanner.nextDouble();
        }

        // Se crea una instancia de la clase Alturas, pasando el arreglo de estaturas como argumento
        Alturas alturas = new Alturas(estatura);

        // Muestra la estatura mayor calculada por la clase Alturas seguida por la menor
        System.out.println("La estatura mayor es: " + alturas.maxEstatura());
        System.out.println("La estatura menor es: " + alturas.minEstatura());
    }
}
