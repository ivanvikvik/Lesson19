package by.itstep.vikvik.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentManagerTest {

    @Test
    public void testCalcAvgStudentMarkPositive(){
        int[] marks = {8, 8, 9, 8};
        double expected = 8.25;

        double actual = StudentManager.calcAvgStudentMark(marks);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalcAvgStudentMarkWithEmptyObject(){
        int[] marks = {}; // int[] marks = new int[0];
        double expected = -1;

        double actual = StudentManager.calcAvgStudentMark(marks);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCalcAvgStudentMarkWithNull(){
        double expected = -1;

        double actual = StudentManager.calcAvgStudentMark(null);

        assertEquals(expected, actual, 0);
    }
}
