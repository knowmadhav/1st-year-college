//input 3 number ,find largest, minimum or both as user say and display that
import java.util.Scanner;

public class I_ask_3no_whichoperationtoperfrom_largestsmallestboth {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Input the first number: ");
        int numa = input.nextInt();
        System.out.print("Input the next number: ");
        int numb = input.nextInt();
        System.out.print("Input the thrid number: ");
        int numc = input.nextInt();
        int max = numa;
        int min = numa;
        System.out.println("What operation do you want to fullfill. Choose.");
        System.out.println("Maximum of above three number (M)");
        System.out.println("minimum of above three number (m)");
        System.out.print("For both Maximum and minium (a): ");
        char decide = input.next().trim().charAt(0);
        if (decide=='M') {// maximum of three number
            if(numb > max){
                max = numb;}
            if(numc>max){
                    max = numc;
                }
            System.out.println("Max number is "+max);
        }
        if (decide=='m') {// minium of three number
            if (numb<min) {
                min = numb;
            }if (numc<min) {
                min = numc;
            }
            System.out.println("Minimum number is "+min);
        }
        if (decide=='a') {// finding both maximum & minimum between 3 input value
            if(numb > max){
                max = numb;}
            if(numc>max){
                    max = numc;
                }
            System.out.println("Max number is "+max);
                System.out.println("-------------------");
                if (numb<min) {
                    min = numb;
                }
                if (numc<min) {
                    min = numc;
                }
                System.out.println("-------------------");
                System.out.println("Minimum number is "+min);
                System.out.println("-------------------");}
        if (decide !='M'&& decide !='m' && decide !='a') {
            System.out.println("Input proper character.");
            System.out.println(" 'M' for finding Maximum. ");
            System.out.println(" 'm' for finding minimum. ");
            System.out.println(" 'a' for finding both Maximum and minimum. ");
        }
    }
}