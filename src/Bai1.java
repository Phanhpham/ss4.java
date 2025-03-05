
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số nguyên dương N
        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        // Kiểm tra số nhập vào có hợp lệ không
        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            // Tính tổng các số từ 1 đến N bằng vòng lặp for
            int total = 0;
            for (int i = 1; i <= N; i++) {
                total += i;
            }

            // Hiển thị kết quả
            System.out.println("Tổng các số từ 1 đến " + N + " là: " + total);
        }

        // Đóng đối tượng scanner
        scanner.close();
    }
}

