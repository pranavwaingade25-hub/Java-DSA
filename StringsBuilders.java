

public class StringsBuilders {
    public static void  main(String[] args) {
        
        // it is helps to the less time code can faster
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // // Char at index 0;
        // System.out.println(sb.charAt(0));

        // //set char at index 0;
        // sb.setCharAt(0,'M');
        // System.out.println(sb);

        // // insert char at index0;
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // //delete the extra 'n'
        // sb.delete(2, 3);
        // System.out.println(sb);

        // // calculate the length
        // System.out.println(sb.length());


        //==========================================================================

        // StringBuilder str = new StringBuilder("H");
        // System.out.println(str);

        // //add in last 
        // str.append("e");
        // str.append("l");
        // str.append("l");
        // str.append("o");
        // System.out.println(str);
        
        //==========================================================================
        // Q. Reverse a String

        // StringBuilder str=new StringBuilder("Hello");
        // for (int i = 0; i < str.length()/2; i++) {
        //     int front =i;
        //     int back =str.length() -i-1;
        //     char frontChar =str.charAt(front);
        //     char backChar =str.charAt(back);
        //     str.setCharAt(front, backChar);
        //     str.setCharAt(back, frontChar);  
        // }
        // System.out.println(str);

    }
}
