import java.util.Scanner;

public class Bai7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        // Duyệt qua tất cả các số từ 1 đến N và kiểm tra số Happy
        System.out.println("Các số Happy trong khoảng từ 1 đến " + N + " là:");

        for (int i = 1; i <= N; i++) {
            int num = i;
            // Kiểm tra xem số i có phải là số Happy không
            while (num != 1 && num != 4) {
                int sum = 0;
                // Tính tổng bình phương các chữ số của num
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit * digit;
                    num /= 10;
                }
                num = sum;
            }

            // Nếu num = 1, thì số i là số Happy
            if (num == 1) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
