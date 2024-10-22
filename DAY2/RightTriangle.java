package DAY2;
import java.util.*;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        int i,j;
        for(i=0;i<n;i++)     //==>rows ==> O(n)
        {
            for(j=0;j<=i;j++)//==>colm ==>O(?)  it depends on above for (i) loop
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
        scan.close();
    }
    
}
