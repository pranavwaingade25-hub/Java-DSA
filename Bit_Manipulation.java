

public interface Bit_Manipulation {
    public static void main(String[] args) {
        /*____________________________________________Quick revision_____________________________________________________________________ */


        // left shift - > N<<1                              |      Right shift -> N>>1
        //                2<<1                              |                     2>>1
        //              010<<1    => 100                    |                   010>>1     => 001


        /*_________________________________________________________________________________________________________________________________ */
        
        // Operations.
        // 1. get Bit       
        // 2. set Bit       
        // 3. Clear Bit
        // 4 .Update Bit

        /*_____________________________________________________ Get Bit ___________________________________________________________________ */
        
        // Get the 3rd bit (position =2 ) of a number n. ( n= 0101 )
        // Bit Mask : 1<<i
        // Operation: AND       Steps:- 1) 1<<i => 1<<2
        //                                         0001 << 2  ==> 0100
        //
        //                              2) 0100 AND 0101
        //                                       |       - Non-Zero =>1
        //                                      0100 ---|
        //                                               - Zero => 0


        // int n =5;
        // int pos =2;
        // int bitMask =1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("Bit was Zero");
        // }
        // else{
        //     System.out.println("Bit was one");
        // }


        /*_____________________________________________________ Set Bit ___________________________________________________________________ */
        // Set the 2nd bit (position =1 ) of a number n. ( n= 0101 )
        // Bit Mask : 1<<i
        // Operation: OR        Steps:- 1) 1<<i => 1<<1
        //                                         0001 << 1  ==> 0010
        //
        //                              2) 0010  OR 0101
        //                                       |       - Non-Zero =>1
        //                                      0111 ---|
        //                                               - Zero => 0
 

        // int n=5 ;
        // int pos=1;
        // int bitMask =1<<pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);


        /*_____________________________________________________ Clear Bit ___________________________________________________________________ */

        // Clear the 3rd bit (position =2 ) of a number n. ( n= 0101 )
        // Bit Mask : 1<<i
        // Operation: AND with not     steps:- 1) 1 << i -> 1<<2
        //                                                  0001<<2 => 0100
        //                                     2) `(0100) =>1011 
        //                                                  1011 & 0101 => 0001

        // int n=5;
        // int pos=2;
        // int bitMask =1<<pos; 
        // int newNumber=(~(bitMask) & n);
        // System.out.println(newNumber);
     

       /*_____________________________________________________ Update Bit ___________________________________________________________________ */
       //Update the 2nd bit(position = 1) of a number n to 1. (n=0101)
       //
       //      for 0                    |      for 1
       //  Bit Mask: 1<<i               | Bit Mask: 1<< i
       //  operation: AND with Not      | Operation: OR

    //    Scanner sc =new Scanner(System.in);
    //    int oper =sc.nextInt();
    //    // oper =1 : set  || oper=0 :clear
    //    int n =5;
    //    int pos= 1;
    //    int bitMask =1<<pos;
    //    if(oper == 1){
    //     // set 
    //     int newNumber=bitMask | n;
    //     System.out.println(newNumber);
    //    }
    //    else{
    //     //clear
    //     int newNumber=(~(bitMask) & n);
    //     System.out.println(newNumber);
    //    }

    }
}
