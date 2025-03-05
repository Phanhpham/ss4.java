import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i;
            boolean isHappy = false;
            // Dùng một set để phát hiện vòng lặp vô hạn
            boolean[] visited = new boolean[1000];
            while (num != 1) {
                if (visited[num]) {

                    break;
                }
                visited[num] = true;

                // Tính tổng bình phương các chữ số của num
                int sumOfSquares = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sumOfSquares += digit * digit;
                    num /= 10;
                }
                num = sumOfSquares;
            }
            if (num == 1) {
                System.out.println(i + " là số Happy.");
            }
        }
    }
}
