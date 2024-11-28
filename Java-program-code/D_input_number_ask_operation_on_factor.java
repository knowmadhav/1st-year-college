// take integer from user , find its factor.
// then , find factor between two integer(input that integer from user)
import java.util.Scanner;
public class D_input_number_ask_operation_on_factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.print("Input the integer whose factor needed: ");
        int num=input.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("Input which operation do you want to perfrom.Choose the alphabet denoted in bracket. :)");
        System.out.println("A.Factor of "+num+" (a)");
        System.out.println("B.Factor of "+num+" between two specific number (b)");
        System.out.print("C.Both the above two operation.(c): ");
        char decide=input.next().trim().charAt(0);
        System.out.println("--------------------------------------");
        if (decide=='a') {//Factor of original number
            for (int i=1;i<=num;i++) {
                //initialising variable i from 1 to that integer
                // if that integer divides completely i --> its a factor
            if (num%i==0) {       
                //checking if integer given by user divides the i 
                System.out.println(i + " is a factor of "+num); 
                //displaying the factor
            }
        }System.out.println("--------------------------------------");
        }
        if (decide=='b') {//Factor between two number
            System.out.print("Input the first integer between which factor needed to be find: ");
            int num1=input.nextInt();
            System.out.print("Input the second integer between which factor needed to be find: ");
            int num2 = input.nextInt();
            System.out.println("---------------------------------------------");
            System.out.println("Now, finding factor of "+num+" between "+num1+" and "+num2+" .");
                if (num>=num1) {//finding factor between 2 given integer
                    if (num2>=num) {//finding factor between given integer and original integer.
                        for(int j =num1;j<=num;j++){
                            if (num%j==0) {
                                System.out.println(j+" is a factor of "+num+" between "+num1+" and "+num2);
                            }
                        }
                    }
                if (num>num2) { //finding factor between 1st given integer to second given integer.
                    for(int k =num1;k<=num2;k++){
                        if (num%k==0) {
                            System.out.println(k+" is a factor of "+num+"between "+num1+" and "+num2);
                        }
                    }
                    System.out.println("------------------");
                }            
            }   else{
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("Please input the first integer less than the number whose factor to be found.");
                    System.out.println("Here it means, "+num1+" should be less than "+num+'.');
                    System.out.println("If you need factor of "+ num+" between "+num1+" and "+num2+".");
                    System.out.println("No such factor exists.");
                    System.out.println("----------------------------------------------------------------------------");}
        }if (decide=='c') {//both operation
            for (int i=1;i<=num;i++) {
                //initialising variable i from 1 to that integer
                // if that integer divides completely i --> its a factor
            if (num%i==0) {       
                //checking if integer given by user divides the i 
                System.out.println(i + " is a factor of "+num); 
                //displaying the factor
            }
        }System.out.println("--------------------------------------");
        System.out.print("Input the first integer between which factor needed to be find: ");
        int num1=input.nextInt();
        System.out.print("Input the second integer between which factor needed to be find: ");
        int num2 = input.nextInt();
        System.out.println("---------------------------------------------");
        System.out.println("Now, finding factor of "+num+" between "+num1+" and "+num2+" .");
            if (num>=num1) {//finding factor between 2 given integer
                if (num2>=num) {//finding factor between given integer and original integer.
                    for(int j =num1;j<=num;j++){
                        if (num%j==0) {
                            System.out.println(j+" is a factor of "+num+" between "+num1+" and "+num2);
                        }
                    }
                }
            if (num>num2) { //finding factor between 1st given integer to second given integer.
                for(int k =num1;k<=num2;k++){
                    if (num%k==0) {
                        System.out.println(k+" is a factor of "+num+"between "+num1+" and "+num2);
                    }
                }
                System.out.println("------------------");
            }            
        }   else{
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Please input the first integer less than the number whose factor to be found.");
                System.out.println("Here it means, "+num1+" should be less than "+num+'.');
                System.out.println("If you need factor of "+ num+" between "+num1+" and "+num2+".");
                System.out.println("No such factor exists.");
                System.out.println("----------------------------------------------------------------------------");}
        }
        if(decide !='a'&& decide !='b' && decide !='c') {
            System.out.println("Please input proper alphabet, i.e. (a) or (b) or (c)");
            System.out.println("----------------------------------------------------");}
    }
}