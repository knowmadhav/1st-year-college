// Write a program to input principal, time, and rate from the user and find Simple Interest.

import java.util.Scanner;

public class M_simple_interest_calculator_totalvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input principle amount: ");
        int p = input.nextInt();
        System.out.print("Input rate of interest: ");
        int r = input.nextInt();
        System.out.print("Input time period in year: ");
        int t = input.nextInt();
        int si = (p*r*t)/100;
        System.out.println("The simple interest is "+si+" and total value is "+(si+p));
    }
}
