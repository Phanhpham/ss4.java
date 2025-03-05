import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // người dùng nhập số liên tục bằng vòng lặp while
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập một số nguyên dương (không dương): ");
            number = scanner.nextInt();
        } while (number <= 0);
    //Nếu người dùng nhập 0, chương trình sẽ dừng lại.
        if (number == 0) {
            System.out.println("Chương trình dừng lại.");
            return;
        }

        //Mỗi số nhập vào sẽ được cộng dồn cho đến khi nhập vào số 0 thì ngưng nhập
        System.out.println("Các số đã nhập vào:");
        int sum = 0;
        while (number!= 0) {
            System.out.print(number + " ");
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println("\nTong các số đã nhập là: " + sum);

        scanner.close();
    }
}
