package ru.Eltex;

import java.util.Random;

public class myRandom {
    private int min = 1;
    private int max = 7;
    private int diff = max - min;
    public int getNumber() {
        Random random = new Random();
        int number = random.nextInt(diff + 1);
        number += min;
        return number;
    }
}
