import java.util.Scanner;

public class Practice_fundamentals_all_Questions {
    
    //Q1
    public static void calculateAverage(int a, int b,int c){
        int sum= a+b+c;
        int average=sum/3;
        System.out.println("The Average of Three number is "+average);
    }

    //Q2
    public static int sumOfOddNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2 !=0){
                sum=sum+i;
            }
        }
        return sum;
    }

    //Q3
    public static void findGreatest(int a ,int b){
        if (a == b) {
            System.out.println("Both number are equals");
        }
        else if (a > b) {
            System.out.println( a+ " is greater then "+b);
        }
        else{
            System.out.println( b+ " is greater then "+a);
        }
    }

    //Q4
    public static float findCircumference(int r){
        float circum= 2 *r *(22/7);
        return circum;
    } 

    //Q5
    public static void eligible(int age){
        if(age > 18){
            System.out.println("YOu are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

    }

    //Q8
    public static int findvaluespower(int x ,int n){
        int result=1;
        for(int i=0;i<n;i++){
            result=result*x;
        }
        return result;

    }

    //Q9
    public static int commonDivisor(int a ,int b){
        while (a != b) {
            if(a > b){
                a= a-b;
            }
            else{
                b=b-a;
            }  
        }
        return b;
    }
        
    public static void main(String[] args) {

        // //Q1. Enter 3 numbers from the user & make a function to print their average.
        // Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c= sc.nextInt();
        // calculateAverage(a, b, c);


        // //Q2. Write a function to print the sum of all odd numbers from 1 to n.
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int ans=sumOfOddNumbers(n);
        // System.out.println("The sume of the odd number is "+ans);

        
        // // Q3. Write a function which takes in 2 numbers and returns the greater of those two.
        // Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // findGreatest(a,b);


        // // Q4.Write a function that takes in the radius as input and returns the circumference of a circle.
        // Scanner sc =new Scanner(System.in); 
        // int r=sc.nextInt();
        // float circumference =findCircumference(r);
        // System.out.println("The Circumference is "+circumference);  


        // // Q5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        // Scanner sc = new Scanner(System.in);
        // int age =sc.nextInt();
        // eligible(age);


        // Q6. Write an infinite loop using do while condition.
        // do {
        //     System.out.println("I am infinite");
        // }while (true);


        // // Q7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        // int Positive =0;
        // int negative=0;
        // int zero =0;
        // System.out.println("You can continue Press 1 and Stop 0");
        // Scanner sc = new Scanner(System.in);
        // int Choice = sc.nextInt();
        // while (Choice == 1) {
        //     System.out.println("Enter the numbers ");
        //     int number= sc.nextInt();
        //     if(number > 0){
        //         Positive ++;
        //     }
        //     else if(number < 0){
        //         negative++;
        //     }
        //     else{
        //         zero++;
        //     }
        //     System.out.println("You can continue Press 1 and Stop 0");
        //     Choice = sc.nextInt();
        // }
        // System.out.println("Positive numbers are "+Positive);
        // System.out.println("Negative numbers are "+negative);
        // System.out.println("Zero numbers are "+zero);

        
        // //Q8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
        // System.out.println("Enter the x value");
        // Scanner sc = new Scanner(System.in);
        // int x =sc.nextInt();
        // System.out.println("Enter the y value");
        // int n =sc.nextInt();
        // int Ans= findvaluespower(x ,n);
        // System.out.println("x to the power of n is "+Ans);


        // // Q9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
        // Scanner sc = new Scanner(System.in);
        // int a =sc.nextInt();
        // int b= sc.nextInt();
        // int common =commonDivisor(a,b);
        // System.out.println("GCD is :" +common);


        // Q10.Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... 
        // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.(BONUS).
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int a =0 ;
        int b= 1;
        System.out.print(a+ " ");
        if(n>1){
            for(int i=0 ; i<=n ;i++){
                System.out.print(b+" ");
                int temp =b;
                b= a+b;
                a=temp;
            }
            System.out.println();
        }


    }
    
}
