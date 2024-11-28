// Take 2 numbers from user, display wether its largest,smallest,equal number.

import java.util.Scanner;

public class H_check_no_largest_smallest_equal_two_no_from_user {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        if (a>b) {System.out.println(a+" is greater than "+b);}
        if (a==b) { System.out.println("Both number are equal.");}
        else{System.out.println(b+" is greater than "+a);}
    }
}