package Teme;

import java.util.Random;
import java.util.Scanner;

public class TemeSesiune2 {
    public static void main(String[] args) {
//exercitiul 1
// Scrie un program care sa primeasca de la tastatura un numar (intre 1 si 5)
// sa afiseze ziua corespunzatoare din saptamana
// se va afisa in consola “Thursday”
      /*Scanner console = new Scanner(System.in);
        int day;
        System.out.println("introdu numarul zilei");
        day = console.nextInt();
        System.out.println(day);

        switch(day){
    case 1:
        System.out.println("luni");
        break;
    case 2:
        System.out.println("marti");
        break;
    case 3:
        System.out.println("miercuri");
        break;
    case 4:
        System.out.println("joi");
        break;
    case 5:
        System.out.println("vineri");
        break;
    default:
        System.out.println("weekend");
        break;
}
      */


//scris ca if

       /* Scanner console = new Scanner(System.in);
        int day;
        System.out.println("introdu numarul zilei");
        day = console.nextInt();

        if (day == 1) {
            System.out.println("luni");
        }
        else if (day == 2) {
            System.out.println("marti");
        }
        else if (day == 3) {
            System.out.println("miercuri");
        }
            else  if(day == 4) {
                System.out.println("joi");
            }
            else if (day == 5) {
                System.out.println("vineri");
            }
            else {
                System.out.println("weekend");
            }
        */


        //exercitiul 2
        //Scrie un program care sa afiseze factorialul unui numar citit de la tastatura
        //se va afisa in consola valoarea 24 (1 * 2 * 3 * 4)
        //int n = 4;

     /* Scanner console = new Scanner(System.in);
        int n;
        int i =  1;
        int fact = 0;
        n = console.nextInt();
        int fact2 =( 1 * 2 * 3 * n );

        while (i <= n) {
            n++;
           }
            System.out.println( fact2 );


      */


        //exercitiul 3
        // Scrie un program care sa calculeze suma cifrelor unui numar citit de la tastatura
        //se va afisa in consola valoarea 6 (1 + 2 + 3)
        // int n1 =123;
      /*Scanner console = new Scanner(System.in);
        int n1;
        n1 = console.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n1) {
            sum = sum + i;
            i++;
        }
            System.out.println(sum);


       */


        //exercitiul 4
        // Scrie un program care calculeaza suma numerelor divizibile cu 3
        // si suma numerelor  divizibile cu 7 din intervalul [1, n],
        // n fiind introdus de utilizator de la tastatura
//se vor afisa in consola doua valori: 30 (3 + 6 + 9 + 12 + 15 + 18 + 21) si 42 (7 + 14 + 21);
        //int n = 21;

      /* Scanner console = new Scanner(System.in);
        int n2;
        int sum = 0;
        int i = 1;
        int sum1 = 0;
        n2 = console.nextInt();
        while (i <= n2) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
             if (i % 7 == 0) {
                sum1 = sum1 + i;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(sum1);

       */

//exercitiul 5
        // Implementeaza un "guessing game", care sa ii ceara utilizatorului sa introduca un numar la tastatura
        // pana il ghiceste pe cel corect,adica raspunsul.
        // Raspunsul va fi generat random si poate fi un numar intre 1 si 10.
        //Daca numarul introdus de utilizator este mai mare decat raspunsul, se va afisa in consola “Numarul introdus este prea mare”
        //Daca numarul introdus este mai mic decat raspunsul, se va afisa consola “Numarul introdus este prea mic”.
        //Procedeul se repeta (utilizatorul trebuie sa tot introduca numere), pana cand numarul introdus va fi acelasi cu raspunsul,
        // moment in care se afiseaza in consola “Ai ghicit, ti-a luat x incercari”, unde x este numarul de incercari pe care le-a facut utilizatorul pana sa ghiceasca raspunsul.
        //Pentru a genera un numar random intre 1 si 10 si a-l stoca in variabila answer, scrie urmatoarele linii de cod:

     /* Scanner console = new Scanner(System.in);
        import java.util.Random;
           Random random = new Random();
            int answer= random.nextInt(10)+1;
            int n;
            int i = 1;
            int x = 0;
            //x = nr de incercari pe care le-a facut;
            n = console.nextInt();
            while( answer != i ){
                int x = x + i;
                if(n > answer) {
                    System.out.println("Numarul introdus este prea mare");
                }
                else if(i < answer ){
                    System.out.println("Numarul introdus este prea mic");
                }
                else {
                    System.out.println("Ai ghicit,ti-a luat" x "incercari");
                }

            }

/*


        // exercitiul 6
        //Scrie un program care sa printeze primele n numere din sirul lui Fibonacci
        // (stiati ca e foarte intalnit in natura? )
        //De exemplu, pentru int n = 7;
        //se vor afisa in consola numerele 0 1 1 2 3 5 8;
        // 0+1 =1;1+1=2;1+2=3;

      /* Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.print(sum);



       */


//exercitiul 7
        // Scrie un program in care utilizatorul sa introduca pe rand numere de la tastatura,
        // pana introduce valoarea 0, moment in care se va afisa la consola media tuturor numerelor introduse;
        //

       /* Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int i = 1;
        int sum = 0;
        int mediaNumber = 1;

        while (i <= 0) {
            if (i < 0) {
                sum = sum + i;
            }
            if (i == 0) {
                mediaNumber = sum / n;
            }
            i++;
        }
        System.out.println();

/*
        //exercitiul 8
        //Scrie un program care sa printeze in consola un dreptunghi format din simbolul "#",
        // in functie de lungimea si latimea date de utilizatorș
        //De exemplu, pentru :
        //int width = 4;
        //int heigth = 3;

        /* Scanner console = new Scanner(System.in);
           int n ;
         n=console.nextInt();


         */

        //exercitiul 9
        //Scrie un program care sa printeze in consola urmatorul pattern.
        // Numarul de diezuri pe lungime si latime va fi introdus de utilizator de la tastatura.
        //De exemplu, pentru
        //int n = 7

       /* Scanner console = new Scanner(System.in);
        int n;

        n = console.nextInt();

        int i = 1;
        int product = 1;

        while (i <= n) {
            if (i < n) {
                product = product * n;
                System.out.print("#");
            }
            if (i <= n) {
                product = n * n;
            System.out.println("#");
        }
            i++;
            }


        */
    }

}



