package Cursuri;

import java.util.Scanner;

public class StringCurs5 {
    public static void main(String[] args) {

        computeLength();
        getChar();
        computeReverse();

    }
    //scrie un program pentru a fisa lungimea unui string

    public static void computeLength() {
        Scanner console = new Scanner(System.in);
        System.out.println("Introduceti textul");
        String text = console.nextLine();
        int length = text.length();
        System.out.println("Lungimea este : " + length);
    }

    //Scrie un program care sa afiseze caracterul de la un anumit index din string;

    public static void getChar() {
        Scanner console = new Scanner(System.in);
        System.out.println("introduceti textul");
        String text = console.nextLine();
        System.out.println("introduceti indexul");
        int index = console.nextInt();
        char caracter = text.charAt(index);
        System.out.println("Caracterul de la pozitia " + index + " este " + caracter);
    }

    //metoda cu o singura responsabilitate
    //Vrei ca atunci cand utilizatorul isi introduce o parola la cont, sa o introduci inversata in baza de date,
    // pentru a nu putea fi citita de altcineva. Sa speram ca nimeni nu se prinde.
    // Scrie un program care inverseaza un cuvant:
    //De exemplu, pentur String word= “avaJ”, se va afisa in consola “Java”
    //Foloseste functia reverse, apoi rezolva problema fara sa folosesti metoda reverse().
    public static String reverseString(String word) {
        String reverse = "";
        for (int i = word.length(); i <= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }


    public static void computeReverse() {
        Scanner console = new Scanner(System.in);
        System.out.println("Introduceti cuvantul care sa fie inversat");
        String word = console.nextLine();
        String reverseWord = reverseString(word);
        System.out.println("Cuvantul inversat este : " + reverseWord);
    }

}