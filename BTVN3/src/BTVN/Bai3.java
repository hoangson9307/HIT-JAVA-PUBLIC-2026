package BTVN;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a = rd.nextInt(101);
        int b = rd.nextInt(101);
        int c = rd.nextInt(201);

        System.out.println(a +" + "+b +" = "+c);

        System.out.print("Phep tinh dung hay sai? ");
        String userInput = sc.nextLine().trim();

        boolean checkKq = (a+b == c);

        if((checkKq && userInput.equalsIgnoreCase("phep tinh dung"))|| (!checkKq && userInput.equalsIgnoreCase("phep tinh sai"))){
            System.out.println("Ban da tra loi dung");
        }
        else {
            System.out.println("Ban da tra loi sai");
        }

    }
}
