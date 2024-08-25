// La clase Operaciones realiza operaciones matemáticas básicas (suma, resta y multiplicación)
// sobre dos números enteros proporcionados por el usuario.

public class Operaciones {

    // Atributos privados que almacenan los números sobre los que se realizarán las operaciones.
    private int num1;
    private int num2;

    // Almacena el resultado de la operación realizada.
    private double result;

    //  Inicializa los atributos num1 y num2 con los valores proporcionados
    //  @param num1 El primer número entero.
    //  @param num2 El segundo número entero.
    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //  Realiza la suma de num1 y num2, y almacena el resultado en el atributo result.
    public void suma() {
        result = num1 + num2;
    }

    //  Realiza la resta de num1 menos num2, y almacena el resultado en el atributo result.
    public void resta() {
        result = num1 - num2;
    }

    //  Realiza la multiplicación de num1 y num2, y almacena el resultado en el atributo result.
    public void multiplicacion() {
        result = num1 * num2;
    }

    //  Retorna el resultado de la última operación realizada (suma, resta o multiplicación).
    //  @return El resultado de la operación como un valor de tipo double.
    public double getResult() {
        return result;
    }
}
