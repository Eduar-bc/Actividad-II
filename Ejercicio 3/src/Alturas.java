 // La clase Datos gestiona un conjunto de estaturas y permite calcular
 // la estatura máxima y mínima de dicho conjunto.
public class Alturas {

    // Arreglo que almacena las estaturas.
    private final double[] estaturas;

    //  Constructor de la clase Datos.
    //  @param estaturas Arreglo de estaturas que se almacenará en la clase.

    public Alturas(double[] estaturas) {
        this.estaturas = estaturas;
    }

     // Calcula la estatura máxima en el arreglo de estaturas.

     // @return El valor máximo de estatura en el arreglo. Si el arreglo está vacío, retornará 0.

    public double maxEstatura(){
        double max = 0; // Inicializa la variable max con el valor 0
        for(double estatura : estaturas){ // Itera sobre cada estatura en el arreglo
            if (estatura > max){ // Si la estatura actual es mayor que max
                max = estatura; // Actualiza el valor de max
            }
        }
        return max; // Retorna la estatura máxima encontrada
    }

    //  Calcula la estatura mínima en el arreglo de estaturas.
    //  @return El valor mínimo de estatura en el arreglo. Si el arreglo está vacío,
    //  retornará Double.MAX_VALUE.

    public double minEstatura(){
        double min = Double.MAX_VALUE; // Inicializa la variable min con el valor máximo posible de double
        for(double estatura : estaturas){ // Itera sobre cada estatura en el arreglo
            if (estatura < min){ // Si la estatura actual es menor que min
                min = estatura; // Actualiza el valor de min
            }
        }
        return min; // Retorna la estatura mínima encontrada
    }
}
