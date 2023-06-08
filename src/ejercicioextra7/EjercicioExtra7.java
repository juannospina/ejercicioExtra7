/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejercicioextra7;

import java.util.Scanner;

public class EjercicioExtra7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int n = entrada.nextInt();
        int contador = 0;
        int numero;
        int suma = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        while (contador < n) {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();

            suma += numero;
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }

            contador++;
        }

        double promedio = (double) suma / n;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
}
