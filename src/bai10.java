import java.util.Scanner;

public class bai10 {

    // Kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    // Tính tổng tất cả các ước của một số
    public static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("Chương trình kiểm tra số nguyên tố, số hoàn hảo và tính tổng các ước:");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tính tổng các ước của một số");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Kiểm tra số nguyên tố
                    System.out.print("Nhập số cần kiểm tra: ");
                    int num1 = scanner.nextInt();
                    if (isPrime(num1)) {
                        System.out.println(num1 + " là số nguyên tố.");
                    } else {
                        System.out.println(num1 + " không phải là số nguyên tố.");
                    }
                    break;
                case 2:
                    // Kiểm tra số hoàn hảo
                    System.out.print("Nhập số cần kiểm tra: ");
                    int num2 = scanner.nextInt();
                    if (isPerfectNumber(num2)) {
                        System.out.println(num2 + " là số hoàn hảo.");
                    } else {
                        System.out.println(num2 + " không phải là số hoàn hảo.");
                    }
                    break;
                case 3:
                    // Tính tổng các ước
                    System.out.print("Nhập số cần tính tổng các ước: ");
                    int num3 = scanner.nextInt();
                    System.out.println("Tổng các ước của " + num3 + " là: " + sumDivisors(num3));
                    break;
                case 4:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
