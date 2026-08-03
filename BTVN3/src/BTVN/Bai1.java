package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        double r;
        do{
            System.out.print("Nhap ban kinh r: ");
            r = Double.parseDouble(sc.nextLine());

            if(r <= 0 || r >= 1000){
                System.out.println("Loi!Yeu cau nhap lai r(0<r<1000)");
            }
        }while (r <= 0 || r >= 1000);

        double chuVi = 2 * r * PI;
        double dienTich = r * r * PI;

        System.out.printf("%.3f",chuVi);
        System.out.printf("\t %.3f",dienTich);
    }


}
