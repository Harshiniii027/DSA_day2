package DAY2;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int tab = scan.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(tab + " * " + i + " = " + (tab*i));
        }
        scan.close();
    }
}
