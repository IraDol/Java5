package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldborder() {
        SQRService service = new SQRService();
        int minimalLimit = 200;
        int maximumLimit = 300;
        int count = 10;
        int expected = 3;

        int actual = service.border(minimalLimit, maximumLimit);

        assertEquals(expected, actual);
    }
    }