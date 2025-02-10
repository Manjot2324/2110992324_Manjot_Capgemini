import java.util.*;

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
