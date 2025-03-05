import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số nguyên N
        System.out.print("Nhập một số nguyên N: ");
        int N = scanner.nextInt();

        // Nếu N âm, chuyển nó thành số dương
        if (N < 0) {
            N = -N;
        }
        // Tính tổng các chữ số của N
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N = N / 10;
        }
        // Hiển thị tổng các chữ số
        System.out.println("Tổng các chữ số của N là: " + sum);

        scanner.close();
    }
}
