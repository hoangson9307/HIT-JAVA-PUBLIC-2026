import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mat khua: ");
        String password =  sc.nextLine();

        String cleanedPassword = password.trim();
        int length = cleanedPassword.length();

        boolean hasDigit = false;
        boolean hasUpper = false;

        for(int i = 0 ; i < length; i++){
            char c = cleanedPassword.charAt(i);
            if(c >= '0' && c <= '9' ){
                hasDigit = true;
            }
            if(c >= 'A' && c <= 'Z'){
                hasUpper = true;

            }
        }
        if(length >= 8 && hasDigit && hasUpper){
            System.out.println("Mat khau hop le!");

        }
        else {
            System.out.println("Mat khau khong hop le!");
            if(length < 8){
                System.out.println("- Do dai phai co it nhat 8 ky tu (Do dai hien tai sau khi cat khoang trang la:"+length+")");

            }
            if(!hasDigit){
                System.out.println("- Mat khau phai co it nhat 1 chu so.");

            }
            if(!hasUpper){
                System.out.println("- Mat khau phai co it nhat 1 chu cai viet hoa.");
            }
        }
    }
}
