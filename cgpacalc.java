import java.text.DecimalFormat;

public class cgpacalc {
    String courseName;
    double marks;
    int credit;
    static final DecimalFormat decfor = new DecimalFormat("0.00");


    public cgpacalc(){
        marks = 0;
        credit = 0;
        courseName = "";
    }
    public double mrksTocgpa(double marks){
        System.out.println(getMarks());
        if(getMarks() <= 100.0 && getMarks() >= 90.0){
            return 4.0;
        }else if(getMarks() <90.0 && getMarks() >= 85.0){
            return 3.75;
        }else if(getMarks() < 85.0 && getMarks() >= 80.0){
            return 3.5;
        }else if(getMarks() < 80.0 && getMarks() >= 75.0){
            return 3.25;
        }else if(getMarks() < 75.0 && getMarks() >= 70.0){
            return 3.0;
        }else if(getMarks() <= 70.0 && getMarks() >= 0.0){
            return 3;
        }else{
            return 55;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
