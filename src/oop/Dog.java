package oop;
   //Creeaza clasa Dog:
   //un caine are atributele: nume, culoare, rasa
   //un caine are comportamentele: bark(latra), run(fuge);

public class Dog {
    String name;
    String color;
    int age;

    Dog(){

    };
    Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;

    }

    void bark() {
        System.out.println(name + " latra");
    }
        void run(){
            System.out.println(name + " fuge");
        }

}
