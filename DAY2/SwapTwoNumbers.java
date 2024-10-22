package DAY2;
import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b=scan.nextInt();
        int temp=a; 
        a=b;
        b=temp;
        System.out.println("After Swapping" + "\n" + "a:" +a + "\n" + "b:"+b);
        scan.close();
    }
    
}
