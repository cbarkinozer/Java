/*
Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.
Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
*/
import java.util.Arrays;
import java.util.List;

public class GrassHopper {

    public static char getGrade(int score1, int score2, int score3) {

        double average = Arrays.asList(score1, score2, score3).stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(-1);

        return (average >= 90) ? 'A' :
                (average >= 80) ? 'B' :
                (average >= 70 ) ? 'C' :
                (average >= 60) ? 'D' : 'F' ;
    }
}
