package Cursuri;

import java.util.Scanner;

public class ForCurs3 {
    public static void main(String[] args) {
//exercitiul 1
        //Scrie un program care sa afiseze numerele de la 1 la 10;

       /* System.out.println("Numaratoarea a inceput");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Numaratoarea s-a incheiat");

        */


        //Scrie un program care sa afiseze numerelor de la 10 la 1;

        /*for(int i = 10 ;i >= 1; i--){
            System.out.print(" " +i);
        }
         */


        //exercitiul2
        //Scrie un program care sa afiseze suma numerelor de la 1 la 10;

       /* int sum = 0;
        for(int i  = 1; i<=10; i++) {
            sum = sum + i;
        }
            System.out.println(sum);
        */


        //exercitiul3
        //Scrie un program care sa afiseze numerele pare de la 1 la 10;

       /* System.out.println("Afisarea numerelor pare");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("afisarea numerelor pare versiunea 2");
        for(int i =2; i <= 10; i+=2){
            System.out.println(i);
        }

        */

        //exercitiul 4
        //Scrie un program care sa faca media numerelor consecutive de la x la y;


        //exercitiul5
        //scrie un program care afiseaza suma numerelor divizibile cu 3 de la 1 la 10;

       /* int sum =0;
        for(int i =1; i<= 10;i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
            System.out.println(sum);

        */
        //exercitiul6
        //Scrie un program care sa afiseze factorialul unui numar;

        /*Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println(fact);
        System.out.println("factorial versiunea 2");
        int f1 = 1;
        for (int j = 1; j <= n; j++) {
            f1 = f1 * j;
        }
        System.out.println(f1);

         */
    }

}