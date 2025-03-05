import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            System.out.println("Các số Palindrome từ 1 đến " + n + " là:");
            for (int i = 1; i <= n; i++) {
                int original = i; // Lưu lại số ban đầu
                int reversed = 0; // lưu số đảo ngược
                int temp = original; // Biến tạm để xử lý

                // Đảo ngược số
                while (temp > 0) {
                    int digit = temp % 10;
                    reversed = reversed * 10 + digit;
                    temp /= 10;
                }
                if (original == reversed) {
                    System.out.print(original + " ");
                }
            }
        }
        sc.close();
    }
}