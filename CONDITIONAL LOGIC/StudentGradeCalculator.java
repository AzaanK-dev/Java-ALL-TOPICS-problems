// Create a Result class that stores marks of three subjects and and print grades by calculating percentage, but hide the marks of each subject to students.

class Result {
    private double s1;
    private double s2;
    private double s3;
    public Result(double s1,double s2,double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public void getGrade(){
        double obt = (s1+s2+s3)/300*100;
        if(obt<100.0 && obt>90.0) System.out.println("A+");
        else if(obt>80.0) System.out.println("A");
        else if(obt>70.0) System.out.println("B");
        else if(obt>60.0) System.out.println("C");
        else if(obt<50.0 && obt>=0.0) System.out.println("FAIL");
    }

}
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Result stu1 = new Result(50,70,65);
        stu1.getGrade();
    }
}