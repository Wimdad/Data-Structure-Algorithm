import java.io.*;

import java.util.* ;


import java.util.*;

class Car {
    int noOfGear;
    String color;
    // Write your constructor and printCarInfo method here.
    Car(int noOfGear, String color) {
        this.noOfGear = noOfGear;
        this.color = color;
    }
}

class RaceCar extends Car {
    int maxSpeed;
    // Write your constructor and printRaceCarInfo method here.
    RaceCar(int nonoOfGear, String color, int maxSpeed) {
        super(nonoOfGear, color);
        this.maxSpeed = maxSpeed;
    }

    void printInfo() {
        System.out.println("nonoOfGear: " + noOfGear);
        System.out.println("colore: " + color);
        System.out.println("maxSpeed: " + maxSpeed);
    }
}

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printInfo();
    }
}