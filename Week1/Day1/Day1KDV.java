package day1notortalaması;
import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day1NotOrtalaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vize %40, final %40, quiz %20
        //60 üstü geçer
        Scanner scan = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz: ");
        int vizegrade = scan.nextInt();
        System.out.print("Quiz notunuzu giriniz: ");
        int quizgrade = scan.nextInt();
        System.out.print("Final notunuzu girniz: ");
        int finalgrade = scan.nextInt();
        
        double ortalama = vizegrade / 10 * 4 + quizgrade / 10 * 2 + finalgrade / 10 * 4;
        
        System.out.println("Vize: " + vizegrade);
        System.out.println("Quiz: " + quizgrade);
        System.out.println("Final: " + finalgrade);
        System.out.println("Ortalama: " + ortalama);
        
        String kontrol = (ortalama >= 60) ? "Geçti" : "Kaldı";
        System.out.println("Geçme durumunuz: " + kontrol);
        scan.close();
    }
    
}
