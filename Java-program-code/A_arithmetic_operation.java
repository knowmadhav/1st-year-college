// input two number, ask from user which operation to perfrom(add,subtract,divide.do it)
import java.util.Scanner;
public class A_add_subtract_quotient_using_loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input the number:");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        System.out.println("choose the valid operation you wanna perform");
        System.out.println("A. Addition(+)");
        System.out.println("B. Subtraction(-)");
        System.out.println("C. Quotient and Remainder(/)");
        System.out.println("D. All the above 3 option(a)");
        System.out.print("Input the proper symbol: ");
        char decide_perfrom=input.next().trim().charAt(0);
        
        int sum = num1+num2;
        int difference = num1-num2;
        int quotient=num1/num2;
        int remainder = num1%num2;

        if (decide_perfrom=='+') {//add
            System.out.println("The addition of "+num1+" and "+num2+" is "+sum);
        }if (decide_perfrom=='-') {//subtract
            System.out.println("The subtraction of "+num1+" and "+num2+" is "+difference);
        }if(decide_perfrom=='/'){//divide & remainder
            System.out.println("The quotient of "+num1+" / "+num2+" is "+quotient+" and remainder is "+remainder);
        }if (decide_perfrom!='+'&& decide_perfrom!='-'&& decide_perfrom!='/'&& decide_perfrom!='a') {//user typed else character
            System.out.println("Input proper symbol as '+'for add,'-'for subtracting,'/'for quotient and remainder ,'a'for finding all above 3. Please");
        }if (decide_perfrom=='a'){//all 3
            System.out.println("The addition of "+num1+" and "+num2+" is "+sum);
            System.out.println("The subtraction of "+num1+" and "+num2+" is "+difference);
            System.out.println("The quotient of "+num1+" / "+num2+" is "+quotient+" and remainder is "+remainder);
        }
    }
}