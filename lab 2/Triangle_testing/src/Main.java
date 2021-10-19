import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, dear! You can use this program to test the triangle with your sides' values. Enjoy it!");
        int first, second, third;
        while(true){
            first = System.in.read();
            second = System.in.read();
            third = System.in.read();
            try {
                Triangle triangle = new Triangle(first, second, third);
                System.out.println(triangle);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
