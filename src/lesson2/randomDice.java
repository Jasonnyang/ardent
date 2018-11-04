package lesson2;

import java.util.Random;

public class randomDice {
    public static void main(String[] args) {
        Random gen = new Random();
        int max = 6;
        int min = 1;
        
        int dice1 = gen.nextInt((max-min) + 1) + min;
        int dice2 = gen.nextInt((max-min) + 1) + min;
        
        int total = dice1 + dice2;
        
        System.out.println("Total of both rolls: " + total );
    }
}