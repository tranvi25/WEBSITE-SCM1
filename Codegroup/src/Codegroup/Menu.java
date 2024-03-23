package Codegroup;
import java.util.*;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void giaiPhuongTrinhBac1() {
        System.out.println("Bạn đã lựa chọn tính năng 1");
        System.out.println("Nhập vào biến a = ");
        int a = sc.nextInt();
        System.out.println("Nhập vào biến b = ");
        int b = sc.nextInt();
        System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
        
        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm.");
            
        } else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có nghiệm x = %.3f\n", x);
        }
    }

    public static void giaiPhuongTrinhBac2() {
        System.out.println("Bạn đã lựa chọn tính năng 2 ");
        System.out.println("Nhập vào số a = ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b = ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số c = ");
        int c = sc.nextInt();
        System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0) {
            giaiPhuongTrinhBac1();
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
                
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép x = %.3f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm riêng biệt, x1 = %.3f, x2 = %.3f\n", x1, x2);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(">> Lựa Chọn Tính Năng <<");
        System.out.println("++ -------------------------------- ++");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Kết thúc");
        System.out.println("++ ---------------- ++");
        System.out.println("Lựa chọn của bạn: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                giaiPhuongTrinhBac1();
                break;
            case 2:
                giaiPhuongTrinhBac2();
                break;
            default:
                System.out.println("Bạn đã thoát chương trình.");
                System.exit(0);
        }
    }
}