package workshop1;


//
public class StudentGradeCalculator {

    public static void calculate(Student student) {
            int total = 0;
            for (int score : student.getRecord()) {
                total += score;
            }
            double average = total / 4.0;
            String grade = getGradeByAverage(average);

            student.setTotal(total);
            student.setAverage(average);
            student.setGrade(grade);
        }

        public static String getGradeByAverage(double avg) {
            if (avg >= 90) return "A";
            else if (avg >= 80) return "B";
            else if (avg >= 70) return "C";
            else if (avg >= 60) return "D";
            else return "F";
        }
    }