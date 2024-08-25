import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese dos números.
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        // Crea una instancia de la clase Operaciones con los números ingresados.
        Operaciones op = new Operaciones(num1, num2);

        // Variable para almacenar la elección de la operación por parte del usuario.
        int operacion;

        System.out.println("/////////////////////");
        // Solicita al usuario que elija una operación.
        System.out.println("Elija la operacion que desea realizar");
        System.out.println("suma 1 \n resta 2 \n multiplicacion 3");

        // Lee la elección del usuario.
        operacion = scanner.nextInt();

        // Ejecuta la operación seleccionada.
        switch (operacion){
            case 1:
                op.suma();
                break;
            case 2:
                op.resta();
                break;
            case 3:
                op.multiplicacion();
                break;
            default:
                System.out.println("Operacion no valida");
        }
        System.out.println("/////////////////////");
        // Muestra el resultado de la operación.
        System.out.println("El resultado de la operacion es: " + op.getResult());
    }
}
