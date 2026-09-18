mport java.util.Scanner;
public class TheTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * length * length;
        double volume = area * length;

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
