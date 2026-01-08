
import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {
        //!-----------------------for Loop---------------------!
        // syntax:-    for(initalisation ; condition ; updation) {   body     }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Hello world");
            
        // }
        
        // Here i++ => i+1;
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(i+" ");
        // }


        //!-----------------------While Loop---------------------!
        // syntax:- initalisation ;   while(condition) {   body updation    }

        // in the while loop check first condition and then exucuted

        // int i=0 ;
        // while (i < 11) { 
        //     System.out.println(i); 
        //     i++;
        // }

        //!-----------------------Do While Loop---------------------!
        // syntax:- initalisation ;   do  {   body updation    }while(condition)

        // in the do while loop at lesat one time exucted and then check condition;

        // int i=0;
        // do { 
        //     System.out.println(i);
        //     i++;
        // } while (i< 10);

        //!-----------------------Loops extra examples---------------------!

        // Q. Sum of the first n numbers;

        // Scanner sc =new Scanner(System.in);
        // int n =sc.nextInt();
        // int sum=0;
        // for (int i = 0; i <= n; i++) {
        //     sum+=i;
        // }
        // System.out.println(sum);


        // Q.Print the tables of number input by the user.

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while (i<=10) { 
            System.out.println(n*i);
            i++;
        }




        
        





    
    
    
    
    
    }
    
}
