package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    //@CsvSource()
    @CsvFileSource(files = "src/test/resources/calc.csv")
    public void calcTest (int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calc(min, max);
        //int expected = 3;

        Assertions.assertEquals(expected,actual);
        }
    }