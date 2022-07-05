package Teme;

import java.util.Scanner;

public class TemaC3date {
    public static void main(String[] args) {

// Teme obligatorii

        //Exercitiul 1
        //Scrie un program care sa afiseze media numerelor consecutive de la x la y,
        // unde x si y sunt introduse de la tastatura.
        //Date de intrare: x=3, y=5 => Rezultat: 4. Explicatie: (3+4+5)/3
        //x,x+1,x+2...
        //nu e bun

     /*   Scanner console = new Scanner(System.in);
        int x;
        int y;
        x = console.nextInt();
        y = console.nextInt();
        int sum = 0;
        int product = 1;
        int i = 1;
        for (i = 1; x < y; i++) {
            sum = sum + i;
            System.out.println(sum);
        }


      */
        // System.out.println(sum);

        // product = sum / x;
        //System.out.println(product);


        //Exercitiul2
        //Scrie un program care afiseaza toate numerele de la x la y care sunt divizibile si cu 3 si cu 7 in acelasi timp,
        // unde x si y sunt introduse de la tastatura.
        //Date de intrare: x=1, y=22 => Rezultat: 21
        //ok
/*
        Scanner console = new Scanner(System.in);
        int x;
        int y;
        x = console.nextInt();
        y = console.nextInt();

        while (x <= y) {
            if ((x % 3 == 0) && (x % 7 == 0)) {
                System.out.println(x);
            }
            x++;
        }

 */


        //Exercitiul 3
        //Scrie un program care verifica daca un numar introdus de la tastatura este numar prim
        // (adica daca se imparte exact doar la 1 si la el insusi)
        //a.Date de intrare: x=7 => Rezultat: “7 este numar prim”
        //b.Date de intrare: x=12 => Rezultat: “12 nu este numar prim”
        // e ok

      /*  Scanner console = new Scanner(System.in);
        int x;
        x = console.nextInt();
        int i = 2;
        boolean isPrime = true;
        //sau for(int i = 3 ; i < x; i+=2)
        //if(x % 2 == 0)
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                isPrime = false;
                System.out.println(x + " nu este numar prim");
                break;
            }
        }
        if (isPrime == true) {
            System.out.println(x + " este numar prim");
        }


       */

        //Exercitiul 4
        //Scrie un program care calculeaza x la puterea y, unde x si y sunt introduse de la tastatura.
        //a.Date de intrare: x=2, y=3 => Rezultat: 8. Explicatie: 2 la puterea 3 este 2*2*2, adica 8;
        //ok

        /*Scanner console = new Scanner(System.in);
        int x;
        int y;
        x = console.nextInt();
        y = console.nextInt();
        int product = 1;

        for( int i = 1; i <= y; i++){
            product = product * x;
        }
        System.out.println(product);

         */


        //Exercitiul 5
        //Esti programator si dezvolti un magazin online.
        // Ai nevoie sa calculezi pretul total al produselor din cosul de cumparaturi,
        // pentru a-l afisa utilizatorului.
        // Scrie un program care sa afiseze suma preturilor dintr-o lista de preturi.
        //Date de intrare: int[] prices = {1, 7, 3, 10, 9}=> Rezultat: 30
        //ok

       /* int[] prices = {1, 7, 3, 10, 9};
        int sum = 0;
        for(int i = 0; i < prices.length ;i++){
            sum = sum + prices[i];
        }
        System.out.println(sum);

        */


        //Exercitiul 6
        //Esti programator si dezvolti un magazin online.
        // Ai nevoie sa calculezi cel mai mare si cel mai mic pret dintr-o lista de preturi pentru a le afisa utilizatorului.
        // Scrie un program care sa determina cel mai mare si cel mai mic numar dintr-o lista.
        //Date de intrare: int[] prices = {1, 7, 3, 10, 9}, =>
        // Rezultat: “Cel mai mic pret este 1, iar cel mai mare pret este 10”
        //facut la ora,ok

       /* int[] prices = {1, 7, 3, 10, 9};
        int min = prices[0];
        int max = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            else if (prices[i] > max) {
                max = prices[i];
            }
        }

        */
      //  System.out.println(min + "cel mai mic pret este");
      //  System.out.println(max + "cel mai mare pret este");


        //Exercitiul 7
        //Scrie un program care sa afiseze cate numere pare si cate numere impare se afla intr-un array:
        //Date de intrare: int[] prices = {1, 7, 3, 10, 9} => Rezultat: “4 numere impare si 1 numar par"
// nu e ok

        /*int[] prices = {1, 7, 3, 10,9};
        boolean isPar= false;
        int i = 0;
        for(i = 0; i <= prices.length; i++) {
            if (i % 2 == 0) {
                isPar = false;
                System.out.println(i + " numere sunt impare");
            }
        }
           if(isPar ==true){
                System.out.println(i +" numar par");
            }


         */


        //Exercitiul 8
        //Esti programator si dezvolti un magazin online.
        // Vrei sa dai posibilitatea utilizatorului sa vada lista de produse de la coada la cap.
        //Scrie un program care sa inverseze elementele unui array si sa le afiseze in consola.
        //Date de intrare:  int[] prices = {1, 7, 3, 10, 9} => Rezultat: 9, 10, 3, 7, 1

        /*int[] prices = {1, 7, 3, 10, 9};
        for (int i = 0; i == 0; i--) {
        System.out.println(prices);
    }

         */

        //Exercitiul 9
        //Scrie un program care afiseaza produsul a cate 2 numere consecutive din array.
        // Daca numarul de elemente este impar, ultimul 0produs va fi numarul insusi
        //Date de intrare:  int[] prices = {1, 7, 3, 10, 9}
        //Rezultat: 7, 30, 9. Explicatie: (7 = 1*7, 30 = 3*10, 9 = 1* 9;

       /* int[]prices = {1, 7, 3, 10, 9};
        int prod = 1;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]  % 2 == 0 ){

                prod = prod * i;
                System.out.println(prod);
            }
        }

        */


        //Exercitiul 10
        //Esti programator si dezvolti un magazin online.
        // Vrei sa ii arati utilizatorului care este cel mai apropiat pret (dintr-o lista de preturi) de bugetul utilizatorului.
        // Scrie un program care afiseaza cel mai apropiat element din array de un numar introdus de la tastatura, n.
        // Daca exista mai multe numere la fel de apropiate,se afiseaza oricare dintre ele.
        //Date de intrare: int[] prices = {1, 7, 3, 10, 9, 18, 0}; int n=12;, Rezultat: 10
        //Date de intrare:  int[] prices = {1, 7, 3, 10, 9, 18, 0}; int n=12;=> Rezultat: 7 sau 3


       /* int[] prices = {1, 7, 3, 10, 9, 18, 0};
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        for (int i = 0; i < prices.length; i++) {
            if (prices [i] <= n) {
                System.out.println(i);
            }
        }


        */


        //exercitiul 10
        //Esti programator si dezvolti o aplicatie de quiz-uri.
        // Intrebarile unui quiz sunt cu o singura varianta de raspuns, sub forma de litera.
        // Task-ul tau este sa verifici cate raspunsuri corecte a dat utilizatorul,
        // avand la dispozitie atat lista cu raspunsurile corecte, cat si lista cu raspunsurile date de utilizator.
        //Date de intrare: char[] correctAnswers = {‘C’, ‘A’, ‘B’, ‘A’, ‘B’;
        // char[] usersAnswers = {‘C’, ‘B’, ‘B’, ‘C’, ‘B’;, Rezultat: 3.
        // Explicatie: sunt trei raspunsuri la fel in cele doua array-uri, la indexul 0 ambele raspusnuri sunt ‘C’,
        // la indexul 2 ambele raspunsuri sunt ‘B’ si la indexul 4 ambele raspunsuri sunt ‘B’

        // char[]correctAnswers = {'C', 'A', 'B', 'A','B'};
        //char[]usersAnswers = {'C','B','B','C','B'};


        //exercitiul 11
        //Scrie un program care afiseaza produsul a cate 2 numere consecutive din array.
        // Daca numarul de elemente este impar, ultimul produs va fi numarul insusi
        //Date de intrare:  int[] prices = {1, 7, 3, 10, 9} => Rezultat: 7, 30, 9.
        // Explicatie: (7 = 1*7, 30 = 3*10, 9 = 1* 9)

        // int []prices = {1, 7, 3, 10, 9};
    }
}