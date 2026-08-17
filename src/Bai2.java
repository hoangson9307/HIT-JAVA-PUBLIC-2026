import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while (true) {
            System.out.println("Nhap do dai 3 canh tam abc:");
            System.out.print("a= ");
            a = Integer.parseInt(sc.nextLine());

            System.out.print("b= ");
            b = Integer.parseInt(sc.nextLine());

            System.out.print("c= ");
            c = Integer.parseInt(sc.nextLine());

            if (a > 0 && b > 0 && c > 0) {
                break;
            }
            System.out.println("Loi! 3 canh phai duong.");
        }
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if((a == b) && b == c){
                System.out.println("Day la tam giac deu");
            }
            else if(a == b || a == c || b == c){
                System.out.println("Day la tam giac can");
            }
            else{
                System.out.println("Day la tam giac thuong");
            }
            int cv = a+b+c;
            System.out.println("Chu vi cua tam giac do la: " + cv);

            double p = (a+b+c)/2.0;

            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Dien tich: %.2f%n", S);


        }
        else{
            System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
        }


    }
}
