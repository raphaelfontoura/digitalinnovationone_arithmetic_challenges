package com.digitalinnovationone.desafiosjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class NumberCountTest {
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
        var input = "7\n" +
                "8\n" +
                "10\n" +
                "8\n" +
                "260\n" +
                "4\n" +
                "10\n" +
                "10";
        var inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        var expected = "4 aparece 1 vez(es)\n" +
                "8 aparece 2 vez(es)\n" +
                "10 aparece 3 vez(es)\n" +
                "260 aparece 1 vez(es)";

        NumberCount.main(null);
        assertEquals(expected, outputStream.toString().trim());
    }

    @Test
    public void TestCase2() {
        var input = "3\n" +
                "2\n" +
                "2\n" +
                "1";
        var inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        var expected = "1 aparece 1 vez(es)\n" +
                "2 aparece 2 vez(es)";

        NumberCount.main(null);
        assertEquals(expected, outputStream.toString().trim());
    }
}
