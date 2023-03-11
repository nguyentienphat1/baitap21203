import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        if (x<=100){
            System.out.println("nhan 5% hoa hong");
        }
        else{
            if (x<=300){
                System.out.println("nhan 10% hoa hong");
            }
            else {
                if (x>300){
                    System.out.println("nhan 20% hoa hong");
                }
            }
        }
    }
}