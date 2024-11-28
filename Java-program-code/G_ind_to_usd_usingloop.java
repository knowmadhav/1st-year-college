// Input currency as user want (inr to dollar )conver in other , display that.
//given 1 usd = 84.41 inr
import java.util.Scanner;
public class G_ind_to_usd_usingloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of currency : ");
        int money = input.nextInt();
        System.out.println("'D' represents us dollar.");
        System.out.println("'R' represents indian ruppee.");
        System.out.print("Input D or R : ");
        char symbol = input.next().trim().charAt(0);
        if (symbol=='D') {//user-->dolar
            double value = money*84.41;//converting from usd to inr
            System.out.println("Value of "+money+" $ is Rs."+value);//displaying it
        }if (symbol=='R') {//user -->inr
            double value = money*0.012;//converting from inr to usd
            System.out.println("Value of Rs. "+money+" is $ "+value);//displaying it
        }else{System.out.print("Input proper letter : D or R");}//user typed something else
    }
}