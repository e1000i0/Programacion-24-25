package Boletín2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numAlum;
        int i = 0;
        float nota;
        int apro = 0;
        int susp= 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Número de alumnos: ");
            numAlum = sc.nextInt();

            if (numAlum < 0){
                System.out.println("Introduce un número válido.");
            }
        } while (numAlum < 0);

        System.out.println("Nota de cada alumno: ");
        do {
            i++;
            System.out.println("Alumno nº " + i);
            nota = sc.nextFloat();
            if (nota >= 5){
                apro++;
            } else {
                susp++
            }
        }
    }
}
