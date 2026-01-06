
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //!-----------------------If else---------------------!
        //#1

        // Scanner sc= new Scanner(System.in);
        // int age=sc.nextInt();
        // if (age > 18) {
        //     System.out.println("YOu are Adult");
        // } else {
        //     System.out.println("Chala bea choteaa");
        // }

        //#2

        // Scanner sc =new Scanner(System.in);
        // int x=sc.nextInt();
        // if(x%2==0){
        //     System.out.println("Even number \t"+x);
        // }
        // else{
        //     System.out.println("Odd number"+x);
        // }
        

        //!----------------------else if----------------------!
        //#1

        // Scanner sc =new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if (a==b) {
        //     System.out.println("Both number are equal");
        // }
        // else if(a > b){
        //     System.out.println("First is greater than Second");
        // }
        // else{
        //     System.out.println("Second is greater than First");
        // }

        //#2

        // Scanner sc =new Scanner(System.in);
        // int button=sc.nextInt();
        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if(button ==2){
        //     System.out.println("Namaste");
        // }
        // else if(button ==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalied Button");
        // }

        //!----------------------Switch----------------------!
        //#1

        Scanner sc =new Scanner(System.in);
        int Button=sc.nextInt();
        switch (Button) {
            case  1:
                    System.out.println("Hello");
                    break;
            case  2:
                   System.out.println("Namaste");
                   break;
            case  3:
                System.out.println("Bonjour");
                break;

            default:
                 System.out.println("Invalid Button");
                 break;

            }
    }
}