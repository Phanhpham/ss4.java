import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        //Nếu n không phải là số nguyên dương thì thông báo “Số nhập vào không hợp lệ”
        if (n <= 0) {
            System.out.println("Số nhập vào không hop lệ");
            return;
        }

        // Tính tong các số từ 1 đến n bang vòng lặp for
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        // In ra kết quả tong
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + total);

        // Tính giá trị của mỗi phép nhân n x i, với i chạy từ 1 đến 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Kết quả của " + n + " x " + i + " là: " + (n * i));
        }
        scanner.close();
    }
}
