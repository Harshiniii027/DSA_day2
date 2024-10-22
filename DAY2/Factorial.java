package DAY2;
import java.util.*;
public class Factorial {
    public static void main(String [] args)
    {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++)
        {
            if(num==0 || num==1)
            {
                fact=1;
                break;
            }
            fact=fact*i;
        }
        System.out.println(fact + " is the factorial " + num);
        scan.close();
    }
    
}
