import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n==========Calculator Menu==========");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int choose = scanner.nextInt();
        switch (choose) {
          case 1:
            System.out.print("\nEnter length side of the square : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nSquare calculation result: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nEnter radius of the circle : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nCircle calculation result: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nEnter the upper side of trapezoid : ");
            double a = scanner.nextDouble();
            System.out.print("Insert the side base of the trapezoid : ");
            double b = scanner.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nTrapezoid calculation result: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\n=========Program End=========");
            break;
          default:
            System.out.println("\nOption are not available. Please input correctly");
            continue;
            }
        repeat = false;
        } 

        catch (InputMismatchException e) {
        System.out.println("\n==========Error: Input must be a number==========");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);


    scanner.close();
  }
}
