//Input number from user, check if its even/odd , display it.

import java.util.Scanner;

public class E_inputno_check_even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = input.nextInt();
        if (number%2==0) {
            System.out.println(number+" is even.");
        }else{
            System.out.println(number+" is odd.");
        }
    }
}