package oop;

//Creeaza o clasa Car:
//o masina are urmatoarele atribute:
//numar de roti,
//viteza maxima,
//brand,
//culoare,
//viteza curenta,
//treapta curenta de viteza
//o masina are urmatoarele comportamente:
//porneste masina
//accelereaza (mareste viteza cu o anumita valoare)
//deceleraza (scade viteza cu o anumita valoare)
//mareste treapta de viteza (daca se accelereaza cu mai mult de 20 km/ora)
//scade treapta de viteza (daca se decelereaza cu mai mult de 20 km/ora)
public class Car {
    static final int numberOfWeels = 4; //constanta;
    final int maxSpeed;  //atribut final;
    public int currentSpeed;
    String brand;
    String color;
    private int currentGear;


      /*Car(int vitezaMaxima) {
          this.maximSpeed = maximSpeed;
      }
     int startCar(int pornire) {
          int pornire = 0;
          return pornire;
      }


      int accelerate(int vitezaAccelerare) {
          vitezaCurenta = vitezaCurenta + vitezaAccelerare;
          return vitezaCurenta;
      }

      int decelerate(int decelerare1, int vitezaAccelerare) {
          int incetinim = vitezaAccelerare - decelerare1;
          return incetinim;
      }

      int maresteTreaptaViteza() {
          treaptaViteza ++;
          return treaptaViteza;
      }

      int scadeTreaptaViteza(int scd, int trVm) {
          int scadeViteza = trVm - scd;
          return scadeViteza;
      }


       */

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void startCar() {
        System.out.println("Masina a pornit");
        this.currentGear = 1;
        this.currentSpeed = 1;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    //mareste viteza curenta cu o anumita valoare
    //Daca viteza se mareste cu mai mult de 20(km/h),se va mari si treapta de viteza cu o unitate
    public void accelerate(int aSpeed) {
        if (this.currentSpeed + aSpeed > maxSpeed) {
            System.out.println("S-a depasit viteza limita!");
        } else {
            this.currentSpeed += aSpeed;
            if (aSpeed > 20) {
                this.currentGear++;
            }
        }
    }

    //Scade viteza cu o anumita valoare
    //Daca viteza scade cu mai mult de 20(km/h),se va trece la o treapta de viteza inferioara(cu o unitate)
    public void decelerate(int dSpeed) {
        if (this.currentSpeed - dSpeed < 1) {
            System.out.println("Masina se va opri!");
        } else {
            this.currentSpeed -= dSpeed;
            if (dSpeed > 20) {
                this.currentGear++;
            }
        }
    }
    //metoda care converteste din km in mile
    public static double convertKmToMiles(double km) {
    return 0.62 * km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", currentGear=" + currentGear +
                '}';
    }
}
