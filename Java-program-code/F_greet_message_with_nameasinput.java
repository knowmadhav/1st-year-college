// Take name as input, display greeting message for that particular name.
import java.util.Scanner;

public class F_greet_message_with_nameasinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = input.nextLine().trim();
        System.out.println("Hey "+name+" ,how are you. I hope you are doing good :)");
    }
}
