//Display multiplication table , input no and till how many number.
import java.util.Scanner;
public class J_inputno_tillhowmanyno_multiplicationtable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number whose multiplication needed: ");
        int number = input.nextInt();
        System.out.print("Input till which number needed to find : ");
        int till = input.nextInt();
        for(int i = 1;i<=till;){
            System.out.println(number+" X "+i+" = "+number*i);
            i++;
        }
    }
}