public class Sorting {
    public static void PrintArray(int arr[]) { 
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();  
    }
     public static void main(String[] args) {
        /*_______________________________________ Bubled Sort ______________________________________________________ */
        //  ___ ___ ___ ___ ___ 
        // | 7 | 8 | 3 | 1 | 2 |
        
        // steps 1) compared  7 and 8  correct conditon soo not changed
        //          compared  8 and 3  condtion not stisfited soo changed hee swap it
        //          compared  8 and 1  condtion not stisfited soo changed hee swap it
        //          compared  8 and 2 condtion not stisfited soo changed hee swap it

        //  ___ ___ ___ ___ ___ 
        // | 7 | 3 | 1 | 2 | 8 | 
        
        //       2) compared  7 and 3  condtion not stisfited soo changed hee swap it
        //          compared  7 and 1  condtion not stisfited soo changed hee swap it
        //          compared  7 and 2  condtion not stisfited soo changed hee swap it
        //          compared  7 and 8  correct conditon soo not changed
        
        //  ___ ___ ___ ___ ___ 
        // | 3 | 1 | 2 | 7 | 8 | 

        //       3) compared  3 and 1  condtion not stisfited soo changed hee swap it
        //          compared  3 and 2  condtion not stisfited soo changed hee swap it
        //          compared  3 and 7  correct conditon soo not changed

        //  ___ ___ ___ ___ ___ 
        // | 1 | 2 | 3 | 7 | 8 | 

        //========================================================================================================================

        // Assending order sort 
        // int arr[] ={7,8,3,1,2};
        // // time Complixity = O(n^2)
        // // Bubbled sort
        // for(int i=0 ; i< arr.length -1 ; i++){
        //     for(int j=0 ; j< arr.length -1-i ;j++){
        //         if(arr[j] > arr[j+1]){
        //             // swap it 
        //             int temp = arr[j];
        //             arr[j] =arr[j+1];
        //             arr[j+1] =temp;
        //         }
        //     }
        // }
        // PrintArray(arr);

        //===============================================================================================================================

        // Desending order sort 
        // int arr[]={7,8,1,3,2};
        // for(int i=0 ; i<arr.length-1;i++){
        //     for (int j = 0; j < arr.length-1-i; j++) {
        //             if(arr[j] < arr[j+1]){
        //                 // Swap it
        //                 int temp =arr[j];
        //                 arr[j]=arr[j+1];
        //                 arr[j+1]=temp;
        //             }
        //     }
        // }
        //PrintArray(arr);

        /*_______________________________________ Selection Sort ______________________________________________________ */

        //  ___ ___ ___ ___ ___ 
        // | 7 | 8 | 3 | 1 | 2 |
        
        // steps :- 1)fisrt value assume as smallest elemtent and comapred all elements and  changed smallest element and at 
        //          the end less smallest element is one position.
        //          2) and next smallest element at position 2 and sooo on same at the end all sorted

        //========================================================================================================================

        // Assending order sort 
        // int arr[]={7,8,3,1,2};
        // //Selection Sort
        // //time complexity =O(n^2)
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest =i;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[smallest] > arr[j]){
        //             smallest =j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;
        // }
        // PrintArray(arr);

        //===============================================================================================================================

        // Desending order sort 
        // int arr[] ={7,8,3,1,2};
        // for(int i=0 ; i<arr.length;i++){
        //     int largest =i;
        //     for(int j=i+1 ; j<arr.length ;j++){
        //         if(arr[largest] < arr[j]){
        //             largest =j;
        //         }
        //     }
        //     int temp = arr[largest];
        //     arr[largest]= arr[i];
        //     arr[i] =temp;
        // }
        //PrintArray(arr);

        /*____________________________________________________ Insertion Sort ___________________________________________________________ */


        // Insertion sorted are dividesd into sorted part and unsorted part

        //  ___ ___ ___ ___ ___ 
        // | 7 | 8 | 3 | 1 | 2 |


        //==================================================================================================================================

        //Assending order sort
    //     int arr[] ={7,8,3,1,2};
    //     // Insertion sort
    //    for(int i=1; i<arr.length; i++) {
    //        int current = arr[i];
    //        int j = i - 1;
    //            while(j >= 0 && arr[j] > current) {
    //                //Keep swapping
    //                arr[j+1] = arr[j];
    //                j--;
    //            }
    //        arr[j+1] = current;
    //    }
    //    PrintArray(arr);


        
        //==================================================================================================================================

        //Desending order sort
    //     int arr[] ={7,8,3,1,2};
    //     // Insertion sort
    //    for(int i=1; i<arr.length; i++) {
    //        int current = arr[i];
    //        int j = i - 1;
    //            while(j >= 0 && arr[j] > current) {
    //                //Keep swapping
    //                arr[j+1] = arr[j];
    //                j--;
    //            }
    //        arr[j+1] = current;
    //    }
    //     PrintArray(arr);

     }
}
