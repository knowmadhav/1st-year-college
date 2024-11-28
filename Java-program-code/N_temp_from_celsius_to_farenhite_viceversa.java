//input temp from user(in farenhite / celsius) change it to other, display
import java.util.Scanner;

public class N_temp_from_celsius_to_farenhite_viceversa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the temp scale(C or K ) where ");
        System.out.println("'C'represent temp in Celsius");
        System.out.print("'K'represent temp in Kelvin: ");
        char decide =input.next().trim().charAt(0);
        System.out.print("Input the temp: ");
        float temp = input.nextFloat();
        if (decide=='C') {//scale is celsius
            double kelvin = temp + 273.15;
            System.out.println("Temp in farenhite is "+kelvin);

        }if (decide=='K') {//scale is kelvin
            double celsius = temp - 273.15;
            System.out.println("Temp in celsius is "+celsius);
        }
        if (decide !='C' && decide !='K') {//C or K is not typed
            System.out.println("Please input proper 'C' or 'K'");
        }
    }
}