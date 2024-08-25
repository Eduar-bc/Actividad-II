
 // Clase Notas que permite manipular un conjunto de notas (calificaciones).
public class Notas {

    // Arreglo que almacena las notas de los estudiantes
    private final double[] notas;

    //  Constructor de la clase Notas.
    //  @param notas Arreglo de calificaciones que se asignará al atributo notas.
    public Notas(double[] notas) {
        this.notas = notas;
    }

    //  Método para obtener la nota más alta del arreglo.
    public double notaMayor() {
        double mayor = 0;
        // Itera sobre cada nota en el arreglo
        for (double nota : notas) {
            // Si la nota actual es mayor que la nota mayor encontrada, se actualiza
            if (nota > mayor) {
                mayor = nota;
            }
        }
        return mayor;
    }


    //  Método para calcular el porcentaje de notas aprobadas.
    //  Considera como aprobada una nota mayor o igual a 3.0.
    //  @return El porcentaje de notas aprobadas respecto al total.
    public double aprobados() {
        double aprobados = 0;
        // Itera sobre cada nota en el arreglo
        for (double nota : notas) {
            // Si la nota es mayor o igual a 3.0, se incrementa el contador de aprobados
            if (nota >= 3) {
                aprobados++;
            }
        }
        // Calcula el porcentaje de aprobados sobre el total de notas
        return (aprobados / notas.length) * 100;
    }

    //  Método para calcular el promedio de las notas.
    //  @return El promedio de todas las notas en el arreglo.
    public double promedio() {
        double suma = 0;
        // Suma todas las notas en el arreglo
        for (double nota : notas) {
            suma += nota;
        }
        // Retorna la suma dividida por el número total de notas
        return suma / notas.length;
    }

    // Método para encontrar la posición de la nota más baja en el arreglo.
    //@return La posición de la nota más baja (1-based index).
    public int notaMenor() {
        double notaMenor = Double.MAX_VALUE; // Inicializa con el valor máximo posible
        int lugarNota = 0;
        // Itera sobre las posiciones del arreglo
        for (int i = 0; i < notas.length; i++) {
            // Si la nota actual es menor que la nota menor encontrada, se actualiza
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
                lugarNota = i + 1; // Guarda la posición (ajustada a 1-based index)
            }
        }
        return lugarNota;
    }
}
