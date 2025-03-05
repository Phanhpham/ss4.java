public class Main {
    public static void main(String[] args){
    // In ra cac số chẵn từ 1-100 và tính tổng các số chẵn đó
        // b1:khởi tạo biến có tổn giá tri 0
        int totalNumber = 0;
        // b2: duyệt từ 1 đến 100
        System.out.println("Các số chẵn từ 1-100 là : ");
        for(int i = 1; i <= 100; i++){
            // b3: kiểm tra xem số đang xét có phải là số ch��n hay không
            if(i % 2 == 0){
                // b4: nếu đúng thì in ra số đó và tính t��ng
                System.out.println(i);
                totalNumber += i;
            }
        }
        // b5: in ra t��ng các số ch��n đã tính
        System.out.println("T��ng các số ch��n từ 1 đến 100: " + totalNumber);
    }
}