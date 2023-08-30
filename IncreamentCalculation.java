import java.util.Scanner;

public class IncreamentCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the salary :");
        double salary = scanner.nextDouble();

        System.out.println("Enter your rating (1  2  3):");
        int rating = scanner.nextInt();

        if (rating==1){

            double totalSalary=salary + salary * 75/100;
            double incrementSalary =totalSalary - salary;
            System.out.println("Your Incremented salary "+incrementSalary);
            System.out.println("Total Salary " +totalSalary );
            System.out.println("@ Congratulation");
        } else if (rating==2) {
            double totalSalary=salary + salary * 50/100;
            double incrementSalary =totalSalary - salary;
            System.out.println("Your Incremented salary "+incrementSalary);
            System.out.println("Total Salary " +totalSalary);
            System.out.println("@ Congratulation");

        } else if (rating==3) {
            double totalSalary=salary + salary * 25/100;
            double incrementSalary =totalSalary - salary;
            System.out.println("Your Incremented salary "+incrementSalary);
            System.out.println("Total Salary "+totalSalary);
            System.out.println("@ Congratulation");
        }
        else {
            System.out.println("please check your Rating !!! ");
        }


    }

}
