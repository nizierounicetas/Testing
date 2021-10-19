import java.util.Arrays;


public class Triangle {
    private int[] sides;

    public int getMaxSide() {
        return sides[2];
    }

    public int getMidSide() {
        return sides[1];
    }

    public int getMinSide() {
        return sides[0];
    }

    public int[] gesSides() {
        return sides.clone();
    }

    public boolean IsIsosceles() {
        return sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2];
    }

    public boolean IsEquilateral() {
        return sides[0] == sides[1] && sides[1] == sides[2];
    }

    public boolean IsVersatile() {
        return !IsIsosceles();
    }

    public int Perimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    public double Square() {
        if (IsEquilateral())
            return (double) sides[0] * sides[0] * Math.sqrt(3) / 4;
        return Math.sqrt((double) Perimeter() * (Perimeter() - 2 * sides[0]) * (Perimeter() - 2 * sides[1]) * (Perimeter() - 2 * sides[2])) / 4;
    }

    public Triangle(int side_1, int side_2, int side_3) throws Exception {
        if (side_1 <= 0 || side_2 <= 0 || side_3 <= 0)
            throw new Exception("Sides should be positive");
        int res[] = new int[3];
        res[0] = side_1;
        res[1] = side_2;
        res[2] = side_3;
        Arrays.sort(res);
        if (res[2] > res[1] + res[0])
            throw new Exception("It is not a triangle");
        sides = res;
    }

    @Override
    public String toString() {
        String type;
        if (IsIsosceles()){
            type = "Isosceles";
        }else if (IsVersatile()){
            type = "Versatile";
        }else{
            type = "Equilateral";
        }
        return "Triangle{" +
                "\nsides= " + Arrays.toString(sides) +
                "\nsquare= " + Square() +
                "\nperimeter= " + Perimeter() +
                "\n}";
    }
}
