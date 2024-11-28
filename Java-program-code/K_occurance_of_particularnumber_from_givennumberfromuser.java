//Q. input a number from user, check how many times a particular number is there from
// original number and display that how many times it occured.
import java.util.Scanner;
public class K_occurance_of_particularnumber_from_givennumberfromuser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = input.nextInt();
        System.out.print("Input the number whose occurance need to be found: ");
        int occurance = input.nextInt();
        int temp = 0;
        while (number>0) {
            int remainder = number%10;
            if(remainder==occurance){
                temp++;
            }
            number=number/10;
        }
        System.out.println("occurence of "+occurance +" is "+ temp);
    }
}