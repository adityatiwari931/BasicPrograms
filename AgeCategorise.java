package Flowcontrol;

import java.util.Scanner;

public class AgeCategorise {
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        System.out.println("enter the basic salary ");
        double sal = scs.nextFloat();
        double hra = 0.3*sal;
        double ta = 0.2*sal;
        double da = 0.1*sal;
        int pf = 1500;
        System.out.println("hra ="+hra);
        System.out.println("ta ="+ta);
        System.out.println("da ="+da);
        System.out.println("pf ="+pf);
        double netsalary= sal+hra+ta+da-pf;
        System.out.println("net salary = " +netsalary);
    }
}
