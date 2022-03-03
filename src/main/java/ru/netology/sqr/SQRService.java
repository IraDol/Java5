package ru.netology.sqr;

public class SQRService {
    public int border(int minimalLimit, int maximumLimit) {
        int counter = 0;

        for (int i = 10; i < 100; i++) {
            if (i * i > minimalLimit && i * i < maximumLimit) {
                counter++;
            }
        }
        return counter;
    }


}

