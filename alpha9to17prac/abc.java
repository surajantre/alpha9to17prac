// public class abc {
//     public static void revercearry(int numbers[]){
//         int first = 0; int last = numbers.length-1;

//         while(first<last){
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++;
//             last--;


//         }

//     }
//     public static void main (String[] args) {
//         int numbers[]={1,2,3,5,7,9};

//         revercearry(numbers);


//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }

// }

// public class abc{

//     public static void reverce(int numbers[]){
//         int first = 0;
//         int last = numbers.length-1;

//         while(first < last){

//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++;
//             last--;
//         }

//     }
//     public static void main(String args[]){
//         int numbers[] = {1,2,3,4,5,7,9};

//         reverce(numbers);

//         for(int i=0; i<numbers.length; i++){
//             System.out.print( numbers[i]);
//         }
//         System.out.println();
//     }
// }


// import java.util.*;
 
// public class abc{
//     public static void xyz(int numbers[]){
//         for(int i=0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("("+curr+","+numbers[j] +  ")");
//             }
//             System.out.println();
//         }
        

//     }

//     public static void main(String[] args){
//         int numbers[] = { 1,2,3,4,5,6,7,8,9};
//         xyz(numbers);

//     }

// }








// import java.util.*;
// public class abc{
//     public static void xyz(int numbers[]){
//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i;j<numbers.length; j++){
//                 int end = j;

//                 for(int k=start;k<=end;k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }

        
//     }

//     public static void main(String[] args){
//         int numbers[] = { 2,4,6,8,10};
//         xyz(numbers);

//     }

// }


// import java.util.*;
// public class abc{
//     public static void kadanve_algo(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<=numbers.length; i++){

//             cs = cs + numbers[i];
//             if(cs <0){
//                 cs = 0;
//             }
//             ms = Math.max(cs,ms);
//             }

//             System.out.println(ms);

        
//     }

//     public static void main(String args[]){
//         int numbers[] = {1,3,5,7,9};
//         kadanve_algo(numbers);
        
//     }
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



// public class abc{
//     public static void selectionSort(int arr []){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos = i;
//             for (int j=i+1;j<arr.length;j++){
//                 if(arr[minPos]>arr[j]){
//                     minPos = j;
//                 }
//             }
//             //swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = arr[minPos];
//         }
//         System.out.println(arr[i]);
//     }

    
//         // public static void printArr(int arr[]){
//         //     for(int i=0;i<arr.length;i++){
//         //         System.out.print(arr[i]+" ");
//         //     }
//         //     System.out.println();
//         // }
//     public static void main(String[] args){
//         int arr[]={2,4,1,3,5,9};
//     selectionSort(arr); 
//         //printArr(arr); 
//     }
// }




// import java.util.*;
// public class abc{ 
//     public static void main(String[] args){
//         int matrix[][]= new int[3][3];
//         int n = matrix.length;int m =matrix[0].length;

//         Scanner sc =new Scanner(System.in);

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//          for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//             System.out.println(matrix[i][j]+" " );
//     }
//     System.out.println();
// }
// }
// }      










// public class abc{

//      public static void  asr(int arr[]){
//         int start = 0;
//         int last = arr.length -1;

//         while(start<last){
//             int temp = arr [start];
//             arr[start]=arr[last];
//             arr[last]=  temp;


//             start ++;
//             last --;



//         }
//      }
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5,6,7,8,9};

//         asr(arr);


//         for(int i=0;i<=arr.length;i++){
//             System.out.print("fcadefr"+args);
//         }
//         System.out.println();


//     }
// }


// public class abc {
//     public static void revercearry(int numbers[]){
//         int first = 0; int last = numbers.length-1;

//         while(first<last){
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;

//             first++;
//             last--;


//         }

//     }
//     public static void main (String[] args) {
//         int numbers[]={1,2,3,5,7,9};

//         revercearry(numbers);


//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }

// }
























// class pen {
//     String colour;
//     String type;//bollpoint; gel

//     /*public void write(){
//         System.out.println("writing something");
//     }*/

//      public void printColour(){
//     System.out.println(this.colour);
//     }
// }
// public class abc{   
//     public static void main(String args[]){
//         pen pen1 = new pen();
//         pen1.colour = "blue";
//         pen1.type = "gel";


//         pen pen2 = new pen();
//         pen2.colour = "black";
//         pen2.type = "ballpoint";
        
//         pen1.printColour();
//         pen2.printColour();     
//        // pen1.write();
//     }

// }



