import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int customerID, orderQty;
        try 
            {
            System.out.print("Enter customer ID: ");
            customerID = inp.nextInt();
            System.out.print("Enter how much food to made: ");
            orderQty = inp.nextInt();

            Thread th1 = new Thread(restaurant);
            Waiters waiters = new Waiters(customerID, orderQty);
            Thread th2 = new Thread(waiters);

            th1.start();
            th2.start();
            th1.join();
            th2.join();

        } catch (Exception e) {
            System.out.println("Input must be an integer");
        }

    }

}