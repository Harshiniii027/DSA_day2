package DAY2;
import java.util.*;
public class LeapOrNot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an year to check:");
        int check = scan.nextInt();
        if(check % 4 == 0 && check % 100 != 0 || check % 400 ==0)
        {
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
        scan.close();

       // if(check%4==0)
       // {
           /// if(check%100!=0)
           // {
               // if(check%400==0)
                //{
              //      yes
            //    }
          //      else{
        //            no
      //          }
    //        }
          //  else{
         //       yes
        //    }
      //  }
    // else{
       //     no
      //  }
    }
    
}
