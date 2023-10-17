package Flowcontrol;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z= sc.nextInt();


        int result = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println(result);


    }
}
