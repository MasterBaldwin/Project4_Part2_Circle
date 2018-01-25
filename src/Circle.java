import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
    Scanner inputStream = new Scanner(System.in);
    int x, y;
    boolean isInCircle = false;

    x = 0;
    y = 0;

    System.out.print("Enter a point with two coordinates: ");
    x = inputStream.nextInt();
    y = inputStream.nextInt();

    isInCircle = Distance(x, y) < 10.0f;
    System.out.println("Point (" + x + ", " + y + ") " + (isInCircle ? "is " : "is not ") + "in the circle.");
}

private static float Distance(int x, int y)
{
    return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
}
}
