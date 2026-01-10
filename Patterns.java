

public class Patterns {
    public static void main(String[] args) {

    //!-----------------------Patterns---------------------!
    //!-----------------------Solid Rectangels---------------------!

    //here outer loops is the helps to print rows 
    //here inner loops is the helps to print column  

    // int n=4;
    // int m=5;
    // for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <= m; j++) {
    //         System.out.print("*");     
    //     }
    //     System.out.println("");
    // }

    //!-----------------------Holo Rectangles---------------------!

    // int n=4;
    // int m=5;
    // for (int i = 1; i <=n; i++) {
    //     for (int j = 1; j <=5; j++) {
    //         if(i == 1 || j ==m ||j==1 ||i ==n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println("");
    // }

    //!-----------------------Half Pyramid---------------------!

    // here logic is the number of row then print * in number of rows (column <= row)

    // int n=9 ;
    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j <= i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //!-----------------------Inverted Half Pyramid---------------------!

    // here i can changes very small the outer loop (row) condtions are changed to opposite for (int i = n; i >= 1; i--)

    // int n=9;
    // for (int i = n; i >= 1; i--) {
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //!-----------------------Inverted Half Pyramid (start in last column)---------------------!

    // int n=9;
    // for (int i = 1; i < n; i++) {
    //     for (int j = 1; j <=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print("*"); 
    //     }
    //     System.out.println();
    // }

    //!-----------------------Half Pyramid with numbers---------------------!

    // int n=9;
    // for (int i = 1; i <=n; i++) {
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print(j);  
    //     }
    //     System.out.println();
    // }

    //!-----------------------Inverted Half Pyramid with numbers---------------------!

    // int n=9;
    // for (int i = n; i >=1; i--) {
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print(j+" ");     
    //     }
    //     System.out.println();
    // }

    //!----------------------- Floyd's triangel---------------------!
    
    // int n=5;
    // int number=1;
    // for (int i = 1; i <=n; i++) {
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print(number+" ");
    //         number++;
    //     }
    //     System.out.println();
    // }

    //!-----------------------0-1 triangel---------------------!

    // int n=5;
    // for (int i = 1; i <=n; i++) {
    //     for (int j = 1; j <=i; j++) {
    //         if((i+j)%2==0){
    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    // }

    //!----------------------- Butterfly patterns---------------------!
    
    // int n=5;
    // //upper half 
    // for (int i = 1; i <=n; i++) {
    //     //1st
    //     for (int j = 1; j <=i; j++) {
    //         System.err.print("*");
    //     }

    //     // Spaces
    //     int Spaces=2*(n-i);
    //     for (int j = 1; j <=Spaces; j++) {
    //         System.out.print(" ");
    //     }

    //     //2nd
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print("*");
            
    //     }
    //     System.err.println("");
    // }

    // // Lower half

    // for (int i = n; i >=1; i--) {
    //     //1st
    //     for (int j = 1; j <=i; j++) {
    //         System.err.print("*");
    //     }

    //     // Spaces
    //     int Spaces=2*(n-i);
    //     for (int j = 1; j <=Spaces; j++) {
    //         System.out.print(" ");
    //     }

    //     //2nd
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print("*");
            
    //     }
    //     System.err.println("");
    // }

    //!----------------------- Solid Rhombus---------------------!

    // int n=5;
    // for (int i = 1; i <=n; i++) {
    //     //Space 
    //     for (int j = 1; j<=n-i; j++) {
    //         System.err.print(" ");
            
    //     }

    //     //display star
    //     for (int j = 1; j <=n; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println("");
        
    // }

    //!----------------------- Number Pyrmids---------------------!

    // int n=5;
    // for (int i = 1; i <=n; i++) {
    //     //spaces
    //     for (int j = 1; j <=n-i; j++) {
    //         System.out.print(" ");  
    //     }
    //     // number pyramids
    //     for (int j = 1; j <=i; j++) {
    //         System.out.print(i+" ");  
    //     }
    //     System.out.println();
    // }

    //!----------------------- Palindromic---------------------!

    // int n=5;
    // for (int i = 1; i <=n; i++) {
    //     // Spaces
    //     for (int j = 1; j <=n-i; j++) {
    //         System.out.print(" ");            
    //     }    
    //     // 1st half numbers
    //     for (int j = i; j >=1; j--) {
    //         System.out.print(j);
    //     }
    //     // 2nd half
    //     for (int j = 1; j <=i; j++) {
    //         if(j>1){
    //             System.out.print(j);
    //         }     
    //     }
    //     System.out.println("");
    // }
    
    //!----------------------- Diamand ---------------------!

        int n=5;
        // Upper half
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");  
            }
            for (int j = 1; j <=(2*i-1); j++) {
                System.err.print("*");
            }
            System.out.println("");
        }

        // Lower half
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");  
            }
            for (int j = 1; j <=(2*i-1); j++) {
                System.err.print("*");
            }
            System.out.println("");
        }
           
    }
}

    




    
