package by.itstep.vikvik.model;

public class StudentManager {
    public static final int STUDENT_COUNT = 5;

    public static double calcAvgStudentMark(int mark1, int mark2, int mark3, int mark4, int mark5) {
        double avg = (double) (mark1 + mark2 + mark3 + mark4 + mark5) / STUDENT_COUNT;
        return avg;
    }
}
