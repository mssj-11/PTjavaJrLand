/*
    2.	Realizar un programa que calcule el radio, este se lo solicitara al usuario por teclado, 
    vamos a usar las clases «Math.PI» para sacar el número Pi y «Math.pow» para elevar al cuadrado el radio. 
    El área de un círculo es igual a PI por radio al cuadrado.
 */
package ejercicios;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área usando la fórmula: Área = PI * radio^2
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}