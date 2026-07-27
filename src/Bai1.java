import java.util.Scanner;

public class Bai1 {
//    Cau 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x1: ");
        int x1 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap y1: ");
        int y1 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap x2: ");
        int x2 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap y2: ");
        int y2 = Integer.parseInt(sc.nextLine());

        double d = Math.sqrt(Math.pow((x2-x1),2.0) + Math.pow((y2-y1),2.0));
        System.out.printf("Khoang cach giua 2 diem A va B la: %.2f%n ",d);
    }
}
