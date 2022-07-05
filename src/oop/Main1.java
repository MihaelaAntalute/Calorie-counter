package oop;

import java.util.Scanner;


public class Main1 {


    public static void main(String[] args) {
/*

        // String dogName = "Labus";
        Dog dogLabus = new Dog();
        dogLabus.age = 3;
        dogLabus.name = "Labus";
        dogLabus.color = "maro";
        System.out.println("Numele catelului este : " + dogLabus.name);
        System.out.println("Catelul are " + dogLabus.age + " ani");
        System.out.println("Culoare catelului este " + dogLabus.color);
        dogLabus.bark();
        dogLabus.run();
        Dog dogRex = new Dog("Rex", "negru", 7);
        System.out.println("Catelul " + dogRex.name + " are culoarea " + dogRex.color + " si " + dogRex.age + " ani");
        dogRex.bark();
        dogRex.run();

        Calculator calculator = new Calculator();
        //calculator.computeSum(1, 3); nu mai avem nevoie de asta
        int sum = calculator.computeSum(1, 3);
        System.out.println("Suma este " + sum);
        int diff = calculator.computeDiff(24, 12);
        System.out.println("Diferenta este " + diff);
        int factorial = calculator.computeFact(12);
        System.out.println("Factorialul este " + factorial);


        Car carAudi = new Car(250);
        carAudi.brand = "Audi";
        System.out.println("Brandul este " + carAudi.brand + " si viteza maxima este " + carAudi.maxSpeed);

        Car carVolkswagen = new Car(280);
        carVolkswagen.brand = "Volksvagen";
        System.out.println("Brandul este " + carVolkswagen.brand + " si viteza maxima este " + carVolkswagen.maxSpeed);
        System.out.println("Fiecare masina are " + carAudi.numberOfWeels);
        System.out.println("Fiecare masina are " + Car.numberOfWeels);

       // int st = carVolkswagen.startCar(0);
        System.out.println("Masina a pornit");
        //int nouaViteza = carVolkswagen.accelereaza(20);
        // System.out.println(nouaViteza);
        System.out.println(carVolkswagen.currentSpeed);
//        System.out.println("Masina accelereaza cu " + accV + " km/h ");
//        int decC = carVolkswagen.decelereaza(20, 10);
//        System.out.println("Masina a incetinit cu " + decC + " km/h");
//        int trvM = carVolkswagen.maresteTrVit(0, 3);
//        System.out.println("Masina mareste treapta de viteza cu " + trvM);
//        int scdV = carVolkswagen.scadeTrVit(3, 2);
//        System.out.println("Masina a scazut treapta de viteza cu " + scdV);


        //curs marti

        //Car car1 = new Car();
    //car1.speedGear =10;
    //car1.engine ="Volvo";
    //Car.engine ="Audi";





        //100km in mile
        //simulam un joc cu cursa de masini
        //1.Creeam o masina= obiect de tip car;
       Car car = new Car(180);
       Car car = new Car();
        Scanner console = new Scanner(System.in);
        int option;
        do {
            //2.afisam meniul de optiuni pentru jucator/sofer; Da,repetate
            printMeniu();
            //3.citim optiunea introdusa de utilizator DA,repetat

            option = console.nextInt();
            //4.executam optiunea dorita de utilizator pe baza optiunii introduse DA,repetat
            //     performanceSelectedAction(myCar, option, console);
        } while (option != 6);

        public static void printMeniu () {
            System.out.println("Meniul soferului");
            System.out.println("1. Porneste masina");
            System.out.println("2. Accelereaza");
            System.out.println("3. Decelereaza");
            System.out.println("4. Converteste o distanta din km in mile");
            System.out.println("5. Afiseaza detaliile masinii");
            System.out.println("6. Iesi din aplicatie");
            System.out.println("Alege optiunea");
        }

    public static void performanceSelectedAction(Car car, int option, Scanner console){
            switch (option) {
                case 1:
                    car.startCar();
                    break;
                case 2:
                    System.out.println("Introduceti viteza cu care vreti sa accelerati");
                    int accSpeed = console.nextInt();
                    car.accelerate(accSpeed);
                    System.out.println("Viteza masinii este acum :" + car.currentSpeed);
                    System.out.println("Treapta de viteza este acum: " + car.getCurrentGear());
                    break;
                case 3:
                    System.out.println("Introduceti viteza cu care vreti sa decelerati");
                    int decelerateSpeed = console.nextInt();
                    car.accelerate(decelerateSpeed);
                    System.out.println("Viteza masinii este acum :" + car.currentSpeed);
                    break;
                case 4:
                    System.out.println("");
                case 6:
                    System.out.println("Ai iesit din aplicatie");
                    break;
                default:
                    System.out.println("Optiunea introducasa este invalida,mai incearca o data!");

            }

        }

 */

       /* Person person = new Person();
        Person.name = "Popescu";
        person.age = 17;

        */

     /*
       Employee employee = new Employee();
        employee.lastName = "Popescu";
        employee.firstName = "Ion";
        employee.salary = 12000;
       double p = employee.predictRise(12000);
        employee.raiseSalary(1.65);
       String name = employee.getNameInitials();
        System.out.println(p);
        System.out.println(name);


      */
//se afiseaza cuvantul invers
        //primele doua puse in main
       /* String result = processString("password");
        System.out.println(result);

    }
    public static String processString(String word){
        String result = "";
        while(word.length() > 0){
            result = result + word.charAt(word.length() - 1);
            word = word.substring(0, word.length() - 1);
        }
        return result;
    }

        */

    /*
        int a = compute(10);
    }

    public static int compute(int number) {
        if (number % 2 == 0) {
            return number * 3;
        }
        if (number == 10) {
            return number + 3;
        }
        return number * number;
    }

     */
    }
}