// take an input from user and check wether if its capital letter or not.
import java.util.Scanner;
public class B_first_alphabet_capital_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the character from (a-z) or (A-Z): ");
        char character = input.next().trim().charAt(0); 
        //trim() it trims the spacing
        //charAt()means give the character at ()index.
        if(character >= 'a' && character <='z'){
            System.out.println("it's smallcase.");
        }if (character>='A' && character<='Z') {
            System.out.println("its uppercase.");
        }
    }
}