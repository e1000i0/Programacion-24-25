package Boletín2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numVidas = 5;
        int aleatorio = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            if (num < aleatorio && num > 1 && num < 100) {
                System.out.println("Tas quedao corto");
            } else if (num > aleatorio && num > 1 && num < 100) {
                System.out.println("Tas colao");
            } else if (num < 1 || num > 100) {
                System.out.println("Un número del 1 al 100 makina");}
        numVidas --;
        } while (numVidas > 0 && num != aleatorio);
        sc.close();
        if (num == aleatorio){
            System.out.println("Has ganao makina");
        } else
            System.out.println("Haber estudiao");


    }
}
