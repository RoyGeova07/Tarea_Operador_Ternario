/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umana_roy_tarea.pkg1;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Umana_Roy_Tarea1 {

    //Trabajo de: Roy Umaña 22411312
    //Definicion del Operador ternario: es una funcion que permite tomar decisiones basadas en una condicion
    // booleana de manera concisa en una sola linea de codigo.
    // se puede expresar como una condicion de expresar una estructura condicional if-else.
    // su sintaxis es: condicion ? valor_si_verdadero : valor_si_falso.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // uso del Scanner, que permite al usuario ingresar desde el teclado.
        Scanner lea = new Scanner(System.in).useDelimiter("\n"); // uso del delimiter.

        // numero de valor constante
        int NumeroLimite = 10;
        // se pone una variable para que el usuario ingrese 
        int numero;

        // para que pueda usarse el operador ternario
        String resultado;

        System.out.println("***Uso de Valor Constante***\n");

        System.out.println("en este ejercicio se le pide al usuario que ingrese un numero cualquiera\ny el numero que ingrese puede se mayor o menor al numero  ya puesto en una variable. ");

        System.out.println("\nIngrese un numero: ");
        numero = lea.nextInt();

        // ejemplo del operaador ternario anidado
        // el resultado es igual a, si numero es mayoa al numerolimite que es 10, entonces saldra el mensaje correspondido
        // si no lo es, se evalua si el numero es menor que el numerolimite, si no cumple una de las dos condiciones es verdera
        // significa que el numero es igual a numerolimite.
        resultado = (numero > NumeroLimite) ? "El numero que ingreso es mayor que: " + NumeroLimite
                : (numero < NumeroLimite)
                        ? "El numero que ingreso es menor que: " + NumeroLimite
                        : "El numero que ingreso es mayor que: " + NumeroLimite;

        // se imprime el resultado
        System.out.println(resultado);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // se declaran las varibles
        int numeroPrimo;
        String resultadoPrimo;
        boolean primo = true;
        int index = 2; // se inicializa una variable con un 2, para verificar si el numero tiene divisores.

        System.out.println("*****Ejercicio de variables*****\n");

        System.out.println("en este ejercicio se le pide igualmente al usuario que ingrese un numero cualquiera\ny el numero que ingrese puede ser un numero primo o no.");

        System.out.println("\nIngrese un numero: ");
        numeroPrimo = lea.nextInt();

        // ahora haremos la condiciones para ver si es un numero primo o no.
        if (numeroPrimo <= 1) { // si el numero que se ingreso es menor o igual a 1, no es un numero primo.
            primo = false;
        } else { //  si no
            while (index * index <= numero) { // condicion del bucle, se ejecutara cuando el cuadrado de index sea
                // menor o igual 
                if (numeroPrimo % index == 0) { // dentro del bucle, si el numero que se ingreso es divisible con index, 
                    // el modulo devuelve el resto de la division del numero ingresado por index. Si el numero ingresado % index
                    // es 0 significa que el numero ingresado es divisible por index y por la tanto, no es primo

                    primo = false; // si se encuentra un divisor, si el numero es divisible por ir primo es falso
                    // y sale del bulcle con un break.
                    break;
                }
                // si el numero ingresado no es divible por index se incrementa index en 1 y se repite el proceso 
                // hasta que index * index ya no sea menor o igual que el numero ingresado.
                index++;

            }
        }

        // se usa el operador ternario para ver si es un numero primo o no
        resultadoPrimo = primo ? "es un numero Primo" : "no es un numero primo";

        // se imprime el resultado
        System.out.println("El numero que ingreso: " + resultadoPrimo);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("*****Ejercicio de formulas*****");

        // mensaej para enteder el ejercicio
        System.out.println("\nEn este ejercicio se le pedira al usuario un numero el operador ternario calculara si es\nun numero positivo, numero negativo o si es el 0.");

        // se declara las variables
        int numeroformula;
        int resultadoformula;
        String tipoNumero;

        // donde el usuario tiene accion
        System.out.println("Ingrese un numero: ");
        numeroformula = lea.nextInt();

        // el tipo de numero es igual a = el numero que se ingreso es mayor a entonces es positivo
        // si no si, el numero ingresado es menor que cero entonces es negativo, si no es cero.
        tipoNumero = (numeroformula > 0) ? "positivo" : (numeroformula < 0) ? "negativo" : "cero";

        // el resultadoformula es igual a = el numero ingresado es mayor a cero entonces se multiplicara al cuadrado,
        // si no si, el numero ingresado es menor que 0 entonces el numero ingresado es -5, -(-5) se convierte en 5. y saldra un numero positivo
        // si no, es 0.
        resultadoformula = (numeroformula > 0) ? (numeroformula * numeroformula)
                : (numeroformula < 0) ? (-numeroformula) : 0;

        // mensaje en pantalla
        System.out.println("El numero que ingreso es: " + numeroformula + " y es: " + tipoNumero);
        System.out.println("El resultado de la formula es: " + resultadoformula);

    }

}
