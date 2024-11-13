/*
    1.	Realizar un programa que calcule el sueldo de un trabajador, 
    el programa va a solicitar el número de horas que has trabajado en un mes, 
    las horas se pagan a 200 pesos.
 */
package ejercicios;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de horas trabajadas en el mes
        System.out.print("Ingresa el número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        // Definir el valor por hora (200 pesos)
        int pagoPorHora = 200;

        // Calcular el sueldo
        int sueldo = horasTrabajadas * pagoPorHora;

        // Mostrar el sueldo calculado
        System.out.println("El sueldo del trabajador es de: " + sueldo + " pesos.");

        // Cerrar el scanner
        scanner.close();
    }
}