import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();
        if(n<2){
            System.out.println("Không phải số nguyên tố");
        }
        // kiểm tra xem n có chia hết cho bất kỳ số nào từ 2 đến √n.
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(n + " không phải là số nguyên tố");
                return;
            }
        }
        System.out.println(n + " là số nguyên tố");
        scanner.close();
    }
}
