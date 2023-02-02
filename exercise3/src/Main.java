import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Basic Salary :");
        double basicSalary = sc.nextDouble();
        double hra, da, grossSalary;

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.2;
            da = basicSalary * 0.8;
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.9;
        } else {
            hra = basicSalary * 0.3;
            da = basicSalary * 0.95;
        }

        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary : " + grossSalary);
    }
}