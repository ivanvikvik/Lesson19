package by.itstep.vikvik.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayWorkerTest {
    @Test
    public void testMaxPositive() {
        int[] array = {-1, 4, -7, 5, -3};
        int expected = 5;

        int actual = ArrayWorker.max(array);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxWithEmptyObject() {
        int[] array = {};
        ArrayWorker.max(array);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxWithNull() {
        ArrayWorker.max(null);
    }

}
