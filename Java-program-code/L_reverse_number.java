//Q.input number from user , reverse and display the output.

import java.util.Scanner;

public class L_reverse_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number(+ve number only): ");
        int number = input.nextInt();
        int ans=0;
        while (number>0) {
            int rem = number%10;
            number = number/10;
            ans = ans*10+rem;
    }
    System.out.println("Reverse of above number is "+ans);
}
}
