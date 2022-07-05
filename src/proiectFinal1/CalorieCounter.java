package proiectFinal1;

import proiectFinal1.Product;
import proiectFinal1.ProductCatalog;

import java.util.Scanner;

public class CalorieCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner console = new Scanner(System.in);
        int options;
        do {
            printMenu();
            options = console.nextInt();
            performselectedAction(options,console,productCatalog);
        }
        while (options != 6);
    }

    public static void printMenu() {
        System.out.println("MENIU : ");
        System.out.println("1. Adauga produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. Iesi din aplicatie");
        System.out.println("_______________________________________");
        System.out.println("Alege actiunea cu numarul : ");
    }

    public static void performselectedAction(int option, Scanner console, ProductCatalog productCatalog) {
        switch (option) {
            case 1:
                System.out.println("Adauga produsul in calculator si calculeaza-i caloriile");
                System.out.println("Introdu numele");
                String productName = console.next();
                System.out.println("Adauga grasimi");
                int grasimi = console.nextInt();
                System.out.println("Adauga carbohidrati");
                int carbohidrati = console.nextInt();
                System.out.println("Adauga proteine");
                int proteine = console.nextInt();
                Product product = new Product(productName, grasimi, carbohidrati, proteine);
                int numberOfCalories = product.computeCalories(grasimi, carbohidrati, proteine);
                product.totalCalories = numberOfCalories;
                System.out.println("Produsul " + productName + " are " + numberOfCalories + " calorii." );
                productCatalog.addProduct(product);
                break;
            case 2:
                System.out.println("Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
                System.out.println("Adauga grasimi");
                int grasimi1 = console.nextInt();
                System.out.println("Adauga Carbohidrati");
                int carbohidrati1 = console.nextInt();
                System.out.println("Adauga proteine");
                int proteine1 = console.nextInt();
                Product product1 = new Product();
                int numberOfCalories1 = product1.computeCalories(grasimi1, carbohidrati1, proteine1);
                product1.totalCalories = numberOfCalories1;
                System.out.println("Caloriile totale sunt: " + numberOfCalories1);
                break;
            case 3:
                System.out.println("Afiseaza toate produsele din catalog si caloriile pentru fiecare");
                productCatalog.printProducts();
                break;
            case 4:
                System.out.println("Sterge un produs din catalog");
                System.out.println("Introdu produsul pe care vrei sa il stergi : ");
                String productName5 = console.next();
                productCatalog.getProductByName(productName5);
                productCatalog.deleteProduct(productName5);
                break;
            case 5:
                System.out.println(" Gaseste produs dupa nume");
                System.out.println("Introdu numele ");
                String productName2 = console.next();
                Product product2 = productCatalog.getProductByName(productName2);
                if (product2.productName != null) {
                    System.out.println("Produsul gasit este: " + product2);
                }
                else{
                    System.out.println("Produsul nu a fost gasit");
                }
                break;
            case 6:
                System.out.println("Iesi din aplicatie");
                break;
            default:
                System.out.println("Alege actiunea cu numarul intre 1 - 6 ");
        }

    }
}
