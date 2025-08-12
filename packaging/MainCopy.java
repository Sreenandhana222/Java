package main;

import demo.DemoCopy;

public class MainCopy {
    public static void main(String[] args) {
        DemoCopy randomGen = new DemoCopy();
        int luckyNumber = randomGen.getRandomNumber(1, 10);
        System.out.println("Your lucky number today is: " + luckyNumber);
    }
}
