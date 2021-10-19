import java.io.IOException;

public class Main {

    public static void Test(int a, int b, int c, String property, String expected, boolean expected_build) {
        System.out.println("Triangle sides: " + a + " " + b + " " + c + " ");
        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (!expected_build) {
                System.out.println("Not build as expected");
            } else {
                System.out.println("ooops, something went wrong");
            }
            System.out.println("----------------------------------------------------------------");
            return;
        }
        System.out.println("Expected " + property + " " + expected + "\n");
        System.out.println("----------------------------------------------------------------");


    }

    public static void TestWithPrecount(int a, int b, int c) {
        boolean expected_build = a < (b + c) && b < (a + c) && c < (a + b);
        try {
            Triangle triangle = new Triangle(a, b, c);
            double half_perimeter = (double) (a + b + c) / 2;
            double square = Math.sqrt(half_perimeter * (half_perimeter - a) * (half_perimeter - b) * (half_perimeter - c));
            int max_len = Math.max(Math.max(a, b), c);
            int min_len = Math.min(Math.min(a, b), c);
            double perimeter = 2 * half_perimeter;
            System.out.printf("Expected:\nPerimeter: %f\nSquare: %f\nMinSide: %d\nMaxSide: %d\n", perimeter, square, min_len, max_len);
            System.out.printf("Got:\nPerimeter: %f\nSquare: %f\nMinSide: %d\nMaxSide: %d\n", (float) triangle.Perimeter(), triangle.Square(), triangle.getMinSide(), triangle.getMaxSide());
            boolean passed = perimeter == (float) triangle.Perimeter() && square == triangle.Square() && min_len == triangle.getMinSide() && max_len == triangle.getMaxSide();
            System.out.println(passed ? "Passed" : "Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (!expected_build) {
                System.out.println("Not build as expected. Passed");
            } else {
                System.out.println("ooops, something went wrong. Failed");
            }
        } finally {
            System.out.println("-----------------------------------------------------------------------");
        }


    }

    public static void main(String[] args) throws Exception {
        Test(3, 4, 5, "IsIsosceles", "False", true);
        Test(2, 0, 0, "", "", false);
        TestWithPrecount(3, 2, 2);
    }
}
