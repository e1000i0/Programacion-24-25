package Boletín2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer número");
        int num1 = sc.nextInt();

        System.out.println("Escribe el segundo número");
        int num2 = sc.nextInt();

        System.out.println("Escribe el tercer número");
        int num3 = sc.nextInt();

        sc.close();

        if (num1 > num2 && num1 > num3 && num2 > num3){
                System.out.println("De menor a mayor, este es el orden de los números: " + num3 + "<" + num2 + "<" + num1);
            } else if (num2 < num3) {
                System.out.println("De menor a mayor, este es el orden de los números: " + num2 + "<" + num3 + "<" + num1);
            } else if (num2 > num1 && num2 > num3) {
            }
        }
    }
