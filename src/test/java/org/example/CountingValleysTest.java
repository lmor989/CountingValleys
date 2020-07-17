package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CountingValleysTest {
    CountingValleys obj = new CountingValleys();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void countingValleysTest() {
        int num = 8;
        String s = "UDDDUDUU";

        int expected = 1;
        int actual = obj.countingValleys(num, s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countingValleysTest2() {
        int num = 12;
        String s = "DDUUDDUDUUUD";

        int expected = 2;
        int actual = obj.countingValleys(num, s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countingValleysTest3() {
        int num = 10;
        String s = "DUDDDUUDUU";

        int expected = 2;
        int actual = obj.countingValleys(num, s);

        Assert.assertEquals(expected, actual);
    }
}
