//ascii value of first character of a given statement from user.

import java.util.Scanner;
public class C_ascii_value_of_first_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the sentence/word/integer/symbols whose ASCII value needed : ");
        char letter = input.next().trim().charAt(0);
        int num = letter;
        System.out.println("Asci value of first character of "+letter+" is "+num);
    }
}