import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        if(m >= 90) System.out.println("A Grade");
        else if(m >= 75) System.out.println("B Grade");
        else if(m >= 50) System.out.println("C Grade");
        else System.out.println("Fail");
    }
}
