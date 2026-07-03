import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2PriceOfPlaneTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        km birim fiyatı = 105$
        12 yaş altına %50 indirim
        12-24 yaş arasına %10 indirim 
        65 üzerine %30 indirim
        gidiş dönüşe %20 indirim
         */
        Scanner scan = new Scanner(System.in);
        int age, km, type;
        double price;
        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        System.out.print("Please enter the distance(km): ");
        km = scan.nextInt();
        System.out.print("Please enter your ticket type(1- Only outgoing 2- Round Trip): ");
        type = scan.nextInt();

        if (km > 0 && age > 0 && (type == 1 || type == 2)) {
            System.out.println("Valid information. Staring process.");
            if (age < 12 && type == 1) {
                price = (km * 105) * 0.5;
                System.out.println("Ticket price is: " + price);
            } else if (age < 12 && type == 2) {
                price = (km * 105) * 0.3;
                System.out.println("Ticket price is: " + price);
            } else if (age >= 12 && age <= 24 && type == 1) {
                price = (km * 105) * 0.9;
                System.out.println("Ticket price is: " + price);

            } else if (age >= 12 && age <= 24 && type == 2) {
                price = (km * 105) * 0.7;
                System.out.println("Ticket price is: " + price);

            } else if (age >= 65 && type == 1) {
                price = (km * 105) * 0.7;
                System.out.println("Ticket price is: " + price);

            } else if (age >= 65 && type == 2) {
                price = (km * 105) * 0.5;
                System.out.println("Ticket price is: " + price);

            } else {
                if (type == 2) {
                    price = (km * 105) * 0.8;
                    System.out.println("Ticket price is: " + price);
                } else {
                    price = km * 105;
                    System.out.println("Ticket price is: " + price);
                }

            }
        } else {
            System.out.println("Invalid information. Please try again.");
        }
        scan.close();
    }

}
