package BTVN;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so nguyen N (N >= 3): ");
            n = sc.nextInt();

            if(n < 3){
                System.out.println("Loi!");
            }
        }while(n < 3);

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int dem = 0;
        int prevPrev = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;

        for(int x : arr){
            if(prevPrev != Integer.MIN_VALUE && prev != Integer.MIN_VALUE){

                if(prev > prevPrev && prev > x){
                    dem++;
                }
            }
            prevPrev = prev;
            prev = x;
        }

        System.out.println(dem);



    }
}
