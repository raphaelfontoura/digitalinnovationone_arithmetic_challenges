package com.digitalinnovationone.desafiosjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VerifyNumberTest {
    private final PrintStream systemOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(systemOut);
    }

    @Test
    public void TestCase1() {
        var input = "-5\n" +
                "0\n" +
                "-3\n" +
                "-4\n" +
                "12\n" +
                "";
        var inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        var expected = "3 valor(es) par(es)\n" +
                "2 valor(es) impar(es)\n" +
                "1 valor(es) positivo(s)\n" +
                "3 valor(es) negativo(s)";

        VerifyNumber.main(null);
        assertEquals(expected, outputStream.toString().trim());
    }

    @Test
    public void TestCase2() {
        var input = "5\n" +
                "0\n" +
                "-3\n" +
                "7\n" +
                "14\n" +
                "";
        var inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        var expected = "2 valor(es) par(es)\n" +
                "3 valor(es) impar(es)\n" +
                "3 valor(es) positivo(s)\n" +
                "1 valor(es) negativo(s)";

        VerifyNumber.main(null);
        assertEquals(expected, outputStream.toString().trim());
    }
}
