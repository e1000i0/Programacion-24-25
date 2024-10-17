package Boletín2;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nuMayor;
        int nuMedio;
        int nuMenor;

        System.out.println("Escribe el primer número");
        int num1 = sc.nextInt();

        System.out.println("Escribe el segundo número");
        int num2 = sc.nextInt();

        System.out.println("Escribe el tercer número");
        int num3 = sc.nextInt();

        sc.close();
        nuMedio = num3;

        if (num1 > num2) {
            nuMayor = num1;
            nuMenor = num2;
        } else {
            nuMayor = num2;
            nuMenor = num1;
        }
        if (num3 > nuMayor) {
            nuMedio = nuMayor;
            nuMayor = num3;
        } else {
            nuMedio = nuMenor;
            nuMenor = num3;
        }
        System.out.println("De menor a mayor, el orden de los números es:" + nuMenor + "<" + nuMedio + "<" + nuMayor);
    }
}
