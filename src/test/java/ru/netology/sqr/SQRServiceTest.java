package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldBorder() {
        SQRService service = new SQRService();
        int minimalLimit = 200;
        int maximumLimit = 300;
        int expected = 3;

        int actual = service.border(minimalLimit, maximumLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBorderAnother() {
        SQRService service = new SQRService();
        int minimalLimit = 300;
        int maximumLimit = 400;
        int expected = 2;

        int actual = service.border(minimalLimit, maximumLimit);

        assertEquals(expected, actual);
    }
}