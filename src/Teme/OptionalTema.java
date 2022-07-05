package Teme;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OptionalTema {
    public static void main(String[] args) {

        //Exercitiul 1
        //Afisati numerele de la 1 la x, x fiind un numar introdus de la tastatura;

      /* Scanner console = new Scanner(System.in);
        int x;
        x = console.nextInt();
        int i = 1;
        while (i < x){
            System.out.print(" "+i+" ");
            i++;
        }


       */

        //Exercitiul 2
        //Afisati string-ul “foo” pentru fiecare numar divizibil cu 4 din intervalul x si y,
        //unde numerele x si y sunt introduse de la tastatura
        //Date de intrare: x=3, y=10 => Rezultat: foo foo.
        // Explicatie: se afiseaza de 2 ori “foo” pentru ca exista doua numere divizibile cu 4 in intervalul 3-10: 4 si 8.
        //e ok

        /*Scanner console = new Scanner(System.in);
        int x;
        int y;
        x = console.nextInt();
        y = console.nextInt();
        String foot;
        int i = 1;
        for(i = 1;i <= y; i++) {
            if (i % 4 == 0){

                System.out.println("foo");
            }
        }

         */

        //Exercitiul 3
        //Calculati produsul numerelor impare din intervalul x si y,
        // unde numerele x si y sunt introduse de la tastatura
        //Date de intrare: x=3, y=6 => Rezultat: 15.
        // Explicatie: numerele impare din interval sunt 3 si 5, si produsul lor este 15.
// imi da 1 3 15

       /*Scanner console = new Scanner(System.in);
        System.out.println("Introdu x");
        int x = console.nextInt();
        System.out.println("Introdu y");
        int y = console.nextInt();
        int prod = 1;
        for(int i = 1; i < y; i++){
            if(i % 2 != 0){
                x = i;
                prod = prod * i ;
                System.out.println(prod);
            }
        }

        */


        //Exercitiul 4
        //Modificati elementele unui array adunand la fiecare element valoarea x,
        // unde numarul x este introdus de la tastatura, si afisati elementele array-ului modificat
        //Exemplu:   int[] numbers= {1, 7, 3, 10, 9}; int x=6;=> Output: 7, 13, 9, 16, 15
        // e ok

      /*  Scanner console = new Scanner(System.in);
        int x;
        x = console.nextInt();
        int[] numbers = {1, 7, 3, 10, 9};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i <= x){
                sum = numbers[i] + x;
                System.out.println(sum);
            }
        }

       */

        //Exercitiul 5
        //Afiseaza elementele dintr-un array care se impart exact la numarul x,
        // unde x este introdus de la tastatura
        //Date de intrare:  int[] numbers= {1, 7, 3, 10, 9}; int x=3;=> Rezultat: 3, 9.
        // Explicatie: elementele 3 si 9 sunt cele care se impart exact la 3.
        // ok

       /* Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        System.out.println("Introdu numar");
        int[]numbers = {1, 7, 3, 10, 9};
        int prod = 1;
        for(int i = 0; i < numbers.length; i++){
            if( numbers[i] % x == 0 ){
                prod = prod/ x;
                System.out.println(numbers[i]);
            }
        }

        */


        //Tema optional avansat

        //Exercitiul 1
        //Scrie un program care afiseaza suma a cate 2 numere consecutive de la x la y,
        // unde x si y sunt introduse de la tastatura.
        // Distanta dintre numerele x si y trebuie sa fie numar impar > 0, lucru care se verifica inainte.
        // Daca distanta e para se afiseaza un mesaj de eroare.
        //Date de intrare: x=3, y=8=> Rezultat: 6, 11, 15. Explicatie: 3+4=7, 5+6=11, 7+8 =15
        //Date de intrare: x=3, y=7 => Output: “numerele introduse nu sunt valide”.
        // Explicatia: 7-3=4 deci distanta este para, asa ca numerele nu sunt valide;
// nu e ok
/*
        Scanner console = new Scanner(System.in);
        int x;
        int y;
        x = console.nextInt();
        y = console.nextInt();
        //int number;
        int sum = 0;
        for (int i = 1; i < y; i++) {
            if ( x % 2 == 1) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
            if ( y % 2 == 0) {
                System.out.println("null");
            }
 */


        //Exercitiul 2
        //Avand lungimea si latimea unui patrat (format din caractere “#”),
        // scrie un program care sa afiseze dreptunghiul format.
        // Lungimea si latimea vor fi introduse de catre utilizator de la tastatura.
        //Date de intrare, width = 4, height = 3. Rezultat:

      /*  Scanner console = new Scanner(System.in);
        int width;
        int height;
        width = console.nextInt();
        height = console.nextInt();
        int termen = 1;
        for (int i = 1; i <= width; i++) {
        }
        System.out.print("#");

        for (int j = termen; j <= height; j++) {

        }
        {
            termen = width * height;
            System.out.print("#");
        }

    }

}


       */

//Exercitiul 3
//Afiseaza laturile unui patrat format din “*”, cu latura de lungime n,
// unde n este introdus de la tastatura:
//Date de intrare: n=5.
           /* Scanner console = new Scanner(System.in);
            int n = console.nextInt();
            int prod = 1;
            while (n > 0) {
                if (prod < n) {
                    prod = n * n;
                    System.out.println("*");
                }
            }

            */

//Exercitiul 4
//Scrie un program care sa insereze un element intr-un array, la o pozitie specificata
//Date de intrare: int[] a = {1, 7, 3, 10, 9};
// int position = 2; int number = 4;
// Rezultat: 1, 7, 4, 3, 10, 9. Explicatie: Am inserat numarul
      /*  int[] a = {1, 7, 3, 10, 9};

        Scanner console = new Scanner(System.in);
        System.out.println("Insert number");
        int number = console.nextInt();
        System.out.println("Insert position");
        int position = console.nextInt();



       */
//Exercitiul 5
//Scrie un program care sa gaseasca al doilea cel mai mare numar dintr-un array:
//Date de intrare:  int[] a = {1, 7, 3, 10, 9};  => Rezultat: 9
        //OK

     /*   int[] elements = {1, 7, 3, 10, 9};
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max){
            max = elements[i];
        }
        System.out.println(max);
    }

      */

//Exercitiul 6
//Scrie un program care sa gaseasca perechea de elemente dintr-un array care are produsul maxim
//Date de intrare: int[] a = {1, 7, 3, 10, 9};  => Rezultat: 10, 9.
// Explicatie: 10*9=90, care este produsul maxim

       /* int[] numbers = {1, 7, 3, 10, 9};
        int max = numbers[0];
        int prod = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                prod = prod * max;
                System.out.println(prod);
            }
        }


        */

//Exercitiul 7
//Scrie un program care sa gaseasca toate perechile de elemente (pe linii diferite) dintr-un array,
// a caror suma este egala cu suma introdusa de la tastatura
//Exemplu:  int[] a = {1, 7, 3, 10, 9}; int sum=10, Rezultat: [1, 9], [7, 3]


//Exercitiul 8
//Scrie un program care sa sorteze in mod crescator elementele unui array, si apoi sa le afiseze.
//Exemplu:  int[] a = {1, 7, 3, 10, 9}; => Rezultat: 1,3,7,9,10

    int[] numbers = {1, 7, 3, 10, 9};


//Optional tema string-uri

        //Exercitiul 1
        //Scrie un program care sa afiseze in consola daca un cuvant este palindrom sau nu.
        //Un cuvant sau numar este palindrom daca este egal cu inversul lui
        // (Exemplu: ana - palindrom, mama - nu este palindrom pt ca mama != amam)

        //Exercitiul 2
        //Scrie un program care sa numere literele, spatiile, numerele,
        // si celelalte caractere dintr-un String. (folositi metodele String-ului)
        //De exemplu, pentru “Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33”,
        // se va afisa in consola 23 litere, 9 spatii, 8 numere, 6 alte caractere

        //Exercitiul 3
        //Scrie un program prin care utilizatorul sa introduca de la tastatura hobby-uri ca String-uri,
        // pana cand introduce cuvantul  “stop” sau “exit”.
        // Utilizatorul poate introduce maxim 10 hobby-uri.
        // Fiecare hobby este adaugat intr-un array de string-urii.
        // La sfarsit, cand utilizatorul a introdus  “stop” sau “exit”
        // se vor afisa in consola toate hobby-urile din array

       /* String[] hobbies = new String[10];
        Scanner console = new Scanner(System.in);
        String hobby = console.nextLine();
        int numberOfHobbies;
        //addHobby(hobby);
        public static boolean addHobby(String hobby){
            hobbies[numberOfHobbies]=hobby;
            numberOfHobbies++;
            return true;
        }

        */


        //Exercitiul 4
        //Dezvolti partea de creare a unui nou cont intr-un magazin online
        // si trebuie sa validezi ca parola aleasa de utilizator este corect scrisa.
        // Scrie un program care sa verifice daca o parola este corecta.
        // Regulile pentru ca o parola sa fie corecta sunt:
        //a.parola trebuie sa aiba minim 10 caractere
        //b.parola trebuie sa aiba doar litere sau cifre
        //c.parola trebuie sa contina cel putin doua cifre
        //	Daca parola introdusa nu este valida afiseaza un mesaj sugestiv si permite utilizatorul sa        introduca o alta parola, pana cand introduce o parola valida (respecta regulile)

        //Exercitiul 5
        //Scrie un program care sa citeasca parola utilizatorului de la tastatura, de maxim 3 ori. Parola introdusa este verificata cu o parola existenta (se declara o variabila string care retne parola existenta, corecta) si sa afiseaze un mesaj corespunzator:
        //a.“Cont blocat”, daca introduce gresit de 3 ori parola
        //b.“Te-ai logat”, daca introduce parola corect din maxim 3 incercari

        //Exercitiul 6
        //Scrie un program care sa afiseze toate string-urile care au lungimea para dintr-un array de string-uri ( declarat in cod sau citit de la tastatura)
        //a.Input: [“ana”, “home”, “an”] =>Output: “home”, “an”


        //Exercitiul 7
        //Scrie un program care sa extraga prima jumatate a unui String de lungime para
        //De exemplu, pentru String word = "programmer", se va afisa in consola "progr"

        //Exercitiul 8
        //Scrie un program care sa concateneze doua String-uri, mai putin primul caracter din fiecare
        //Pentru String word1 = "Java"
        // si String word2 = "Fundamentals", se va afisa in consola "avaundamentals"

        //Exercitiul 9
        //Scrie un program care sa compare litera cu litera doua String-uri ,
        // fara sa tina cont de litere mari si litere mici.
        //De exemplu, pentru String word1 = "This is a comparison" si
        // String word2 = "THIS is A Comparison", se va afisa on consola "Frazele sunt la fel”



        //Exercitiul 10
        //Scrie un program care verifica daca un String se termina cu un alt string
        //De exemplu, pentru String s1 = "Java exercises" si String s2 = "ses" ,
        // sa va afisa in consola "Java exercises se termina cu ses"


        //Exercitiul 11
        //Scrie un program care sa verifice daca un String contine un alt String.

        //Exercitiul 12
        //Scrie un program care sa inlocuiasca un anumit caracter cu altul intr-un String

        //Exercitiul 13
        //Scrie un program care sa transforme in litera mare prima litera din fiecare cuvant intr-un String.

        //Exercitiul 14
        //Scrie un program care sa inverseze toate cuvintele dintr-un text.
        // Cuvintele sunt separate de spatii.
        //Input: “This is Java” => Output: “Java is This”













}
}