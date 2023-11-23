/*
utiliza la potencia como limite del contador, luego multiplica el resultado por el numero
luego el resultado toma un nuevo valor y se vuelve a multiplicar el nuevo valor
de resultado por el numero, este ciclo se repite hasta que el contador (1) es
igual a la potencia (3)
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 4;
        // 8. potencia <-- 3
        potencia = 3;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
