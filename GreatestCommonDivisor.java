import java.util.Scanner;

/**
 *
 * @author ABARCA_CPE113
 */
public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          input.useDelimiter("[,\\s]+");
      int a = input.nextInt();
        int b = input.nextInt();
        // validate
        if (a == 0 && b == 0){
            System.out.println("undefined for 0 and 0");
    }else{
            int result = gcd(a,b);
            System.out.println(result);
            
        }
    }
    // Recursive method find GCD
    static int gcd(int a, int b){
    //BASE a and b
        if (b == 0){
        return a;
    }
        // Recursive case
    return gcd(b, a % b);
} 
}
