package Teme;

import java.util.Scanner;

public class StringTeme {
    public static void main(String[] args) {
      checkPassword();

    }


    //Ex.2 Afiseaza cate litere,numere,spatii si cifre sunt intr-un String
    static void getCharCount() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a sentences:");
        String sentence = console.nextLine();


    }



        //Ex 5
        public static void checkPassword(){
        String existingPassword = "ABC";
        boolean isCorectPassword = false;
        int i = 1;
        while((i<=3) && (!isCorectPassword)){
            Scanner console = new Scanner(System.in);
            System.out.println("Insert password");
            String provadedPassword = console.nextLine();
            if (existingPassword.equals(provadedPassword)) {
                System.out.println("Parola introdusa este corecta");
                isCorectPassword = true;
            }
         i++;
        }
        if(isCorectPassword == false){
            System.out.println("Parola introdusa nu este corecta");
        }
        }
    }