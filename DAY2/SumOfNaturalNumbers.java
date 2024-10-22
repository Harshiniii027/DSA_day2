package DAY2;
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int res=0;
        for(int i=0;i<=num;i++)
        {
            res+=i;
        }
        System.out.println("Sum of Natural Numbers is: "+res);
        scan.close();
    }
    
}
