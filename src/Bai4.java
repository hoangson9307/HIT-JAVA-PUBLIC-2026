import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong hoc sinh: ");
        int N = Integer.parseInt(sc.nextLine());

        double[] scores = new double[N];
        while (true) {
            boolean check = true;

            for (int i = 0; i < N; i++) {
                System.out.print("Nhap diem hoc sinh thu " + (i + 1) + ": ");
                scores[i] = Double.parseDouble(sc.nextLine());

                if (scores[i] < 0.0 || scores[i] > 10.0) {
                    check = false;
                }
            }
            if (check) {
                break;
            } else {
                System.out.println("Loi! diem nhap khong hop le.");
            }
        }
        System.out.println("Diem cao nhat: " + findMax(scores));
        System.out.printf("Diem trung binh lop: %.2f%n", calculateAverage(scores));
        System.out.println("So hoc sinh duoi trung binh: "+ countFailedStudents(scores));
    }

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (double v : arr)
            if (v > max) {
                max = v;
            }
        return max;
    }

    public static double calculateAverage(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static int countFailedStudents(double[] arr){
        int count = 0;
        for(double score : arr){
            if(score < 5.0){
                count++;
            }
        }
        return count;

    }

}
