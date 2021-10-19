import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, dear! You can use this program to test the triangle with your sides' values. Enjoy it!");
        int first, second, third;
        int flag = 1;
        Scanner scanner = new Scanner(System.in);
        while(flag != 0){
            System.out.println("Enter sides' values");
            first = scanner.nextInt();
            second = scanner.nextInt();
            third = scanner.nextInt();
            try {
                Triangle triangle = new Triangle(first, second, third);
                System.out.println(triangle);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("If you want to continue enter 1, else enter 0");
            flag = scanner.nextInt();
        }
    }
}
