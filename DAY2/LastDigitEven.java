package DAY2;
import java.util.*;
public class LastDigitEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int last = num%10;

        if(last%2 == 0)
        {
            System.out.println("Last Number is even");
        }
        else
        {
            System.out.println("Last  Number is not even");
        }
        scan.close();
    }
}
