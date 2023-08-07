// import java.util.*;

// public class bsort {
//     public static void revercearry(int number[]){
//         int first = 0;
//         int last = number.length-1;

//         while(first < last){

//             int temp = number[first];
//             number[first] = number[last];
//             number[last] = temp;

//             first++;
//             last--;
//             }

//         }


//             public static void main(String [] args){

//                 int number[] ={1,2,3,4,5,6,7,8,9};

//                 revercearry(number);

//                 for (int i = 0; i < number.length; i++){
//                     System.out.print(" "+number[i]);
//                 }
//                 System.out.println();

//             }

// }



// public class abc{
//     public static void buulesort(int numbers[]){
//         for(int i=0;i<numbers.length-1;i++){
             
//             for (int j=0;j<numbers.length-1-i;j++){

//                 if(numbers[j]>numbers[j+1]){
//                     //swap
//                     int temp = numbers[j];
//                     numbers[j] = numbers[j+1];
//                     numbers[j+1] = temp;

//                 }
         
//             }
            
//             }
//         }

//         public static void printArr(int numbers[]){
//             for(int i=0;i<numbers.length;i++){
//                 System.out.print(numbers[i]+" ");
//             }
//             System.out.println();

        
//     }
//     public static void main(String[] args){
//         int numbers[]={2,3,4,5,1};
//         buulesort(numbers);
//         printArr(numbers);
//     }
// }


// public class bsort {
//     public static void bubbelSort(int number[]){
//         for(int i=0;i<number.length-1;i++){
//             for(int j=0;j<number.length-1-i;j++){
//                 if (number[j]>number[j+1]){
//                     int temp=number[j];
//                     number[j] = number[j+1];
//                     number[j+1] = temp;

//                 }

//             }
//         }

//     }

//     public static void printarr(int number[]){
//         for (int i=0;i<number.length;i++){
//             System.out.print(number[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String []args){
//         int number[] = {1,2,7,9,6,4};
//         bubbelSort(number);
//         printarr(number);


//     }
// }





// public class bsort{

//     public static void buublesort(int number[]){
//         for (int i=0;i<number.length-1;i++){
//             for(int j=0;j<number.length-1-i;j++){
//                 if(number[j]>number[j+1]){
//                     int temp=number[j];
//                     number[j]=number[j+1];
//                     number[j+ 1]=temp;
//                 }
//             }
//         }

//     }
//     public static void printarr(int number[]){
//         for(int i=0;i<number.length;i++){
//             System.out.print(number[i]+" ");

//         }
//         System.out.println();
//     }
//     public static void main(String []args){
//         int number[] = {1,2,9,6,7,8,3,42,1,54};
//          buublesort(number);
//         printarr(number);

//     }
// }