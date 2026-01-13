import java.util.Scanner;

public class Function {
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }

    public static int calculateSum(int a, int b) {
       
        int sum = a+b;
        return sum;
        
    }

    public static int calaculateProduct(int a ,int b) {
        return a*b;
        
    }

    public static void printFactorial(int n){
        if(n < 0){
            System.out.println("Invalid Numbers");
            return;
        }

        int factorial =1;
        for(int i=n; i>=1 ;i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial is "+factorial);
    }

    

    public static void main(String[] args) {

        // //Print Name
        // Scanner sc = new Scanner(System.in);
        // String name =sc.next();
        // printMyName(name);


        // // Sum of two numbers
        // Scanner sc =new Scanner(System.in);
        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // int sum =calculateSum(a,b);
        // System.out.println("The sum of two number is "+sum);


        // // Products of two numbers
        // Scanner sc = new Scanner(System.in);
        // int a =sc.nextInt();
        // int b= sc.nextInt();
        // System.out.println("The products of two number is "+calaculateProduct(a, b));


        // // Factorial of numbers
        // Scanner sc =new Scanner(System.in);
        // int n= sc.nextInt();
        // printFactorial(n);

        
        
         
        
    }
    
}
