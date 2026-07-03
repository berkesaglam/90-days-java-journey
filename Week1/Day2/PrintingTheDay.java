import java.util.Scanner;
/**
 *
 * @author berke
 */
public class Day2PrintingTheDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        take a number from user
        print the day
        1-monday
        2-tuesday
        .
        .
        .
        use switch case
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find out which day it is(1-7): ");
        int num = scan.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Monday!");
                break;
            case 2: 
                System.out.println("Tuesday!");
                break;
            case 3: 
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            case 7: 
                System.out.println("Sunday!");
                break;
            default:
                System.out.println("Invalid number!");
        }
        scan.close();
    }
    
}
