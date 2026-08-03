package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 3 so A B C: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int traLoi = ((a >= b && a <= c)||(a <= b && a >= c)) ? a :
                (((b >= a && b <= c)||(b <= a && b >= c)) ? b : c);

        System.out.println(traLoi);


    }


}
