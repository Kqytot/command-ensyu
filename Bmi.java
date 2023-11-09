import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height1 = scanner.nextDouble();
        double weight1 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        double weight2 = scanner.nextDouble();
        double bmi1 = weight1 / (height1 * height1);
        double bmi2 = weight2 / (height2 * height2);
        System.out.println(bmi1);
        System.out.println(bmi2);
    }
}