
// import java.util.Scanner;
    //Strings are Inmutables

public class Strings {
    public static void main(String[] args) {
        //------------------String Dec,aration----------------//
        // String name = "Tony";
        // String fullName="Tony Stark";
        // String sentense= "My name is Tony Stark";

        // Scanner sc =new Scanner(System.in);
        // String name =sc.nextLine();
        // System.err.println("Your name is: "+name);


        //-------------------------Concatenation------------------//

        // String firsName="Tony";
        // String LastName="Stark";
        // String FullName=firsName+" "+LastName;
        // System.out.println(FullName);

        //---------------------------length------------------------//

        //System.err.println(FullName.length());

        //---------------------------CharAt----------------------//

        // for (int i = 0; i < FullName.length(); i++) {
        //     System.err.println(FullName.charAt(i));
        // }

        //--------------------------Compare the string-----------//

        // String name1= "Tony";
        // String name2= "Tony";
        // if(name1.compareTo(name2)==0){
        //     System.err.println("Strings are equal");
        // }
        // else{
        //     System.err.println("Strings are not equal");
        // }


        //only few cases this are correct
        // if(name1==name2){
        //     System.err.println("Strings are equal");
        // }
        // else{
        //     System.err.println("Strings are not equal");
        // }

        // X
        // if(new String("Tony") == new String("Tony")){
        //     System.err.println("Strings are equal");
        // }
        // else{
        //     System.err.println("Strings are not equal");
        // }

        //--------------------Substring---------------//
        // String sentense="My name is lakhan";
        // String name = sentense.substring(11,sentense.length());
        // System.out.println(name);



        //Q1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        // Scanner sc =new Scanner(System.in);
        // int size=sc.nextInt();
        // String array[] =new String[size];
        // int totLength=0;

        // for (int i = 0; i <size; i++) {
        //     array[i]=sc.next();
        //     totLength+= array[i].length();
            
        // }
        // System.err.println(totLength);

        //Q2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        //    Example : 
        //    original = “eabcdef’ ; result = “iabcdif”
        //    Original = “xyz” ; result = “xyz”

        // Scanner sc = new Scanner (System.in);
        // String str = sc.next();
        // String result = "";
        // for(int i=0; i<str.length(); i++) {
        //     if(str.charAt(i) == 'e') {
        //         result += 'i';
        //     } else {
        //         result += str.charAt(i);
        //     }
        // }
        // System.out.println(result);


        //Q3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        // Example : 
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”
       
        // Scanner sc = new Scanner (System.in);
        // String email = sc.next();
        // String userName = "";
        // for(int i=0; i<email.length(); i++) {
        //     if(email.charAt(i) == '@') {
        //         break;
        //     } else {
        //         userName += email.charAt(i);
        //     }
        // }
        // System.out.println(userName);

    }
    
}
