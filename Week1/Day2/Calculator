import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        4 işlem olacak önce menü gelecek(switch kullna menü için daha mantıklı)
        seçime göre iki sayı alıp işlem yapacağız.
        */
        int result,first,second;
        Scanner scan = new Scanner(System.in);
        System.out.println("----------Calculator----------");
        System.out.println("Please select the operation you want to apply.(1-4): ");
        System.out.println("1- Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        int choice = scan.nextInt();
        
        
        switch (choice) {
            case 1:
                System.out.print("Please enter the first number: ");
                first = scan.nextInt();
                System.out.print("Please enter the second number: ");
                second = scan.nextInt();
                result = first + second;
                System.out.println("Addition of " + first + " and " + second + " is " + result);
                break;
            case 2:
                System.out.print("Please enter the first number: ");
                first = scan.nextInt();
                System.out.print("Please enter the second number: ");
                second = scan.nextInt();
                result = first - second;
                System.out.println("Subtraction of " + first + " and " + second + " is " + result);
                break;
            case 3:
                System.out.print("Please enter the first number: ");
                first = scan.nextInt();
                System.out.print("Please enter the second number: ");
                second = scan.nextInt();
                result = first * second;
                System.out.println("Multiplication of " + first + " and " + second + " is " + result);
                break;
            case 4:
                System.out.print("Please enter the first number: ");
                first = scan.nextInt();
                System.out.print("Please enter the second number: ");
                second = scan.nextInt();
                result = first / second;
                System.out.println("Division of " + first + " and " + second + " is " + result);
                break;
            default:
                System.out.println("Invalid choice please try again(1-4)");
                
                
        }
        scan.close();
    }
    
}
