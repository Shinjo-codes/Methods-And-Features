public class GradeCalculator {

    public static void main (String [] args){

        char grade = gradeCalculator (78);

        System.out.println("Your grade is : " + grade );

    }

    public static char gradeCalculator (int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if(score >= 80 && score <= 89){
            return 'B';
        } else if (score >= 70 && score <= 79){
            return 'C';
        } else if (score >= 60 && score <= 69){
            return 'D';
        } else {
            return 'F';
        }
    }
}
