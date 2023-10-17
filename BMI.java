package Flowcontrol;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height in KG");
        float weight = sc.nextFloat();
       System.out.println("enter your height in Meter");
       float height = sc.nextFloat();
       float BMI = weight/(height*height);
        System.out.println("BMI = "+BMI);
    }
}
