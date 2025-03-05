import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Kiểm tra nhập vào có hợp lệ không (phải là số nguyên dương)
        while (true) {
            System.out.print("Nhập N (số nguyên dương): ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) {
                    break;
                } else {
                    System.out.println("Số nhập vào không hợp lệ, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Số nhập vào không hợp lệ, vui lòng nhập lại.");
                scanner.next();
            }
        }

        // Duyệt qua các số từ 1 đến N để kiểm tra số Armstrong
        for (int i = 1; i <= N; i++) {
            int num = i;
            int sum = 0;
            int digits = 0;

            // Tính số chữ số của num
            while (num > 0) {
                num /= 10;
                digits++;
            }

            num = i;

            // Tính tổng lũy thừa bậc k của từng chữ số
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            // Kiểm tra xem số này có phải là số Armstrong không
            if (sum == i) {
                System.out.println(i + " là số Armstrong.");
            }
        }
    }
}
