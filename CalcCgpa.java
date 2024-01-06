import java.util.Scanner;


public class CalcCgpa {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int courseCount = 0;
        System.out.println("Enter course count: ");
        courseCount = sc.nextInt();

        cgpacalc totalObj[] = new cgpacalc[courseCount];
        for(int i = 0; i < courseCount; i++){
            totalObj[i] = new cgpacalc();
        }

        double cgpa = 0, credit = 0;


        for(int i = 0; i < courseCount; i++){
            System.out.print("Add name, marks and credit: ");
            String tempName = sc2.nextLine();
            totalObj[i].setCourseName(tempName);
            double tempmarks = sc.nextDouble();
            totalObj[i].setMarks(tempmarks);
            int tempCredit = sc.nextInt();
            totalObj[i].setCredit(tempCredit);
        }

        for(int i = 0; i < courseCount; i++){
            cgpa += totalObj[i].mrksTocgpa(totalObj[i].getMarks())*totalObj[i].getCredit();
            credit += totalObj[i].getCredit();
        }

        System.out.println("CGPA is: " + cgpacalc.decfor.format((Double) cgpa/credit));
    }
}
