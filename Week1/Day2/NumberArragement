import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2NumberArragement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        3 numara al hepsini karşılaştır büyükten küçüğe sırala
        */
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter the first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        num3 = scan.nextInt();
        
        if(num1 >= num2 && num1 >= num3) {
            if(num2 >= num3) {
                System.out.println("Order: " + num1 + " " + num2 + " " + num3);
            }
            else {
                System.out.println("Order: " + num1 + " " + num3 + " " + num2);
            }
        }
        else if(num2 >= num1 && num2 >= num3) {
            if(num1 >= num3) {
                System.out.println("Order: " + num2 + " " + num1 + " " + num3);
            }
            else {
                System.out.println("Order: " + num2 + " " + num3 + " " + num1);
            }
        }
        else if(num3 >= num2 && num3 >= num1) {
            if(num2 >= num1) {
                System.out.println("Order: " + num3 + " " + num2 + " " + num1);
            }
            else {
                System.out.println("Order: " + num3 + " " + num1 + " " + num2);
            }
        }
        scan.close();
    }
    
}
