package Flowcontrol;
import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

                System.out.print("Enter temperature in Celsius (°C): ");
                double celsius = input.nextDouble();

                double fahrenheit = (celsius * 9/5) + 32;

                System.out.println("Temperature in Fahrenheit (°F): " + fahrenheit);



    }
}
