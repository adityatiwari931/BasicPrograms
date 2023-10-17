package Flowcontrol;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.nextLine();
        System.out.println("enter the class :");
        int clasS = sc.nextInt();
        System.out.println("enter your marks ");
        System.out.println("Math = ");
        int math = sc.nextInt();
        System.out.println("Hindi =");
        int hindi = sc.nextInt();
        System.out.println("Physics =");
        int physics = sc.nextInt();
        System.out.println("Chemistry =");
        int chem = sc.nextInt();
        System.out.println("Biology =");
        int bio = sc.nextInt();
        float avgMarks = (math+hindi+physics+chem+bio)/5;
        System.out.println("AvgMarks = "+avgMarks);
        if (avgMarks>=85){
            System.out.println("grade = A");
        } else if (85<avgMarks && avgMarks>=60) {
            System.out.println("grade=  B");

        }
        else if (60<avgMarks && avgMarks>=40) {
            System.out.println(" grade = C");

        }
        else if(avgMarks<40){
            System.out.println(" grade = D");

        }
        double percent =  (math+hindi+physics+chem+bio)*0.2;
        System.out.println("Percent ="+percent);
    }
}
