public class Day3WhileExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Example 1: Even number from 1 to 100
        Example 2: Addition of odd numbers from user until program gets a negative number
        Example 3: Two's power until the number from user.
        */
        
        //Example 1
        int a = 1;
        while(a <= 100) {
            if(a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }
        //Example 2
        Scanner scan = new Scanner(System.in);
        int addition = 0;
        int number;
        while(true) {
            System.out.print("Enter the number: ");
            number = scan.nextInt();
            
            if(number < 0) {
                System.out.println("Number is negative. Loop ends here");
                break;
            }
            if(number % 2 != 0) {
                addition += number;
                System.out.println("Total is: " + addition);
            }
        }
        
        //Example 3
        System.out.print("Enter the number to see two's powers until that number: ");
        int input = scan.nextInt();
        
        int k = 1;
        while(k < input) {
            System.out.print(k + " ");
            k = k * 2;
        }
        scan.close();
    }
    
}
