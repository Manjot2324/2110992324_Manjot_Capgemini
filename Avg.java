import java.util.*;

class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);
    }
}
