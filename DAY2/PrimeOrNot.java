package DAY2;
import java.util.*;
public class PrimeOrNot {
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    if(num<=1)
    {
        System.out.println("Neither PRIME NOR COMPOSITE");
    }

    int flag=1;
    for(int i=2;i<Math.sqrt(num);i++)
    {
        if(num%i==0)
        {
            flag=0;
        }
    }
    if(flag==0)
    {
        System.out.println("Not a PRIME");
    }
    if(flag==1)
    {
        System.out.println("Is a PRIME");
    }
    scan.close();
}
}
