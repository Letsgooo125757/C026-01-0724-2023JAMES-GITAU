import java.util.Scanner;
public class Marksheet{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String Names, regNumber;
        int Semester, Marks, CCS2101, CCS2102, CCS2103, CCS2104, Total;
        float Average;

        System.out.println("Enter Your full name: ");
        Names = scan.nextLine();
        System.out.println("Enter your registration number: ");
        regNumber = scan.nextLine();
        System.out.println("Enter your semester: ");
        Semester = scan.nextInt();
        System.out.println("Enter your marks for CCS2101: ");
        CCS2101 = scan.nextInt();
        System.out.println("Enter your marks for CCS2102: ");
        CCS2102 = scan.nextInt();
        System.out.println("Enter your marks for CCS2103: ");
        CCS2103 = scan.nextInt();
        System.out.println("Enter your marks for CCS2104: ");
        CCS2104 = scan.nextInt();

        Total = CCS2101 + CCS2102 + CCS2103 + CCS2104;
        Average = (float) (Total / 4.0);

        System.out.println("\t\t\t\t\t\tDepartment of computer Science");
        System.out.println("\t\t\t\t\t\t\tEnd Semester Results");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|Name:- "+ Names +"\t\t |Roll_No: "+ regNumber +"\t\t |Semester: "+Semester+" ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|Unit Code \t\t\t\t |Unit Name \t\t\t\t\t\t |Score");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|CCS2101 \t\t\t\t |Database \t\t\t\t\t\t\t |"+CCS2101+" ");
        System.out.println("|CCS2102 \t\t\t\t |Systems \t\t\t\t\t\t\t |"+CCS2102+" ");
        System.out.println("|CCS2103 \t\t\t\t |Algorithm \t\t\t\t\t\t |"+CCS2103+" ");
        System.out.println("|CCS2104 \t\t\t\t |Statistics \t\t\t\t\t\t |"+CCS2104+" ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|Total \t\t\t\t\t\t\t\t\t\t\t\t\t\t |"+Total+" ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|Average \t\t\t\t\t\t\t\t\t\t\t\t\t |"+Average+" ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|Grade \t\t\t\t\t\t\t\t\t\t\t\t\t\t |A");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t  Recommendation | ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Grading Criteria\t\tOverall Grade(A-D)\t\tRecommend Pass");
        System.out.println("70-100\t\t\t\t\tA");
        System.out.println("60-69\t\t\t\t\tB");
        System.out.println("50-59\t\t\t\t\tC");
        System.out.println("40-49\t\t\t\t\tD");
        System.out.println("Below 40\t\t\t\tF");
        System.out.println("--------------------------------------------------------------------------------");

    }
}
