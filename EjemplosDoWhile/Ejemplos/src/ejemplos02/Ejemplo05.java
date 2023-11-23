/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclador por el usuario.
 */
package ejemplos02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        System.out.println("Ingrese el numero");
        numero = entrada.nextInt();
        // 8. potencia <-- 3
        System.out.println("Ingrese la potencia");
        potencia = entrada.nextInt();
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
