// public class pract{
//     public static void main(String []args){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){

//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }




// public class pract{
//     public static void main(String[] args){
//         int n = 7;
//         for(int i =1;i<=n;i++){
//             for (int j =1;j<=n-i+1;j++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }




// public class pract{
//     public static void main(String[] args){
//         int n = 7;
//         for(int i =1;i<=n;i++){
//             for (int j =1;j<=i;j++){
//                 System.out.print(j);

//             }
//             System.out.println();
//         }
//     }
// }




// public class pract{
//     public static void main(String[] args){
//         int n = 3;
//         char ch ='A';

//         for (int i = 0; i <= n;i++){
//             for (int j=1; j <= i; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }








// import java.util.*;
// public class pract{

//     public static void calculatesum(){
//         Scanner sc = new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();

//         int sum = x+y;

//         System.out.println("sum = "+sum);

//     }
//     public static void main(String[] args){
//         calculatesum();

//     }

// }



// public class pract{

//     public static int factorial(int n){

//         int f = 1;

//         for (int i = 1; i<=n; i++){
//             f=f*i;
//         }
//         return f;

               
//         }
//     public static void main(String[] args){
//         System.out.println(factorial(3));

//     }
// }



// public class pract{

//     public static boolean isPrime(int n){

//         if(n == 2){
//             return true;
//         }

//         for (int i = 2; i<=Math.sqrt(n); i++){
//             if (n % i ==0){
//                 return false;

//             }
//         }
//         return true;
//     }

//     public static void isPrimeRange(int n){
//         for(int i =2;i<=n; i++){
//             if (isPrime(i)){
//                 System.out.println(i);
//             }
//         }
//                System.out.println();
//         }
    
      
    
//     public static void main(String[] args){
//          isPrimeRange(20);

//     }
// }


// public class pract{

//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow = 0;
//         int desNum = 0;

//         while(desNum > 0){
//             int lastdigit = desNum % 10;
//             desNum=desNum + (lastdigit *(int)Math.pow(2,pow));

//             pow++;
//             binNum = binNum/10;

//         }
//         System.out.println(myNum+"="+desNum);

//     }


//     public static void main(String args[]){
//         binToDec(11);


//     }
// }





// public class pract1{

//     public static void  desToBin(int n){
//         int binNum = 0;
//         int pow = 0;
//         int myNum = n;

//         while(myNum > 0){
//             int rem = n%2;
//             binNum = binNum + (rem *(int)Math.pow(10,pow));
//             pow++;
//             n=n/2;
//         }
//         System.out.println("your binary number "+myNum+"="+binNum);


//     }
//     public static void main(String args[]){
//         desToBin(7);

//     }
// }
// import java.util.*;

// public class pract1{
//     public static void hello_rectangle(int totRows,int totCols){
//         for(int i=0;i<=totRows;i++){
//             for(int j=0;j<=totCols;j++){
//                 if(i==1||i==totRows||j == 1|| j==totCols ){
//                     System.out.println("*");
//                 }else{
//                 System.out.println(" ");
//             }
//         }
//         System.out.println();

//         }
//     }
//     public static void main(String[] args){
//          hello_rectangle(4, 5);

//     }
// }




// public class pract1{
//     public static void zeroOneTriangle(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");

//                 }else{
//                     System.out.print("0");
//                 }
                

//         }
//         System.out.println();
//     }
    
//     }
//     public static void main(String[] args){
//         zeroOneTriangle(4);


//     }
// }



// public class pract1{
//     public static void butterfly(int n){
//        for(int i=0; i<=n; i++){

//         for(int j=0; j<=i; j++){
//             System.out.print("*");
//        }
//        for(int j=0; j<=2*(n-i); j++){
//         System.out.print(" ");

//        }
//        for(int j=0; j<=i; j++){
//         System.out.print("*");
//        }
//        System.out.println();
//        }
    

//     for(int i=n; i>=1; i--){
        
//         for(int j=0; j<=i; j++){
//             System.out.print("*");
//        }
//        for(int j=0; j<=2*(n-i); j++){
//         System.out.print(" ");

//        }
//        for(int j=0; j<=i; j++){
//         System.out.print("*");
//        }
//        System.out.println();
//     }
//        }
    
//     public static void main(String[] args){
//         butterfly(9);

//     }
// }

// public class pract1{
//     public static void butterfiy(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             for(int j=1; j<=2*(n-i);j++) {
//                 System.out.print(" ");
//             }
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");
//              }
//              System.out.println();

//         }
//         for(int i=n; i>=1;i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             for(int j=1; j<=2*(n-i);j++) {
//                 System.out.print(" ");
//             }
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");
//              }
//              System.out.println();

//         }

//         }
    
//     public static void main(String args[]){
//         butterfiy(4);

//     }

// }



// public class pract1{
//     public static void findLinearSearcher(int number[],int key){
//         for(int i =0;i<numbers.length;i++){
//             if(numbers[i]==key){
//             return i;
//         }
        
//     }
//      return -1;

//     }
//     public static void main(String[] args){
//         int numbers[]={2,3,5,7,9,1,3,5,7,9,};
//         int key = 10;

//         int index = findLinearSearcher(numbers,key);
//         if (i==-1){
//             System.out.println("key is not found");

//         }else{
//             System.out.println("key is at index " + index);
//         }
//     }
// }



// import JAVA.UTIL.*;
// public class pract1{
//     public static void largestvalue(int numbers[]){
//         int largest=Integer.MIN_VALUE;  

//         for (int i=0;i<numbers.length;i++){
//             if (largest < numbers[i]){
//                 lartgest = numbers[i];
//             }
//         }
//         return largest;

//     }
//     public static void main(String args[]){
//         int numbers[]={1,2,3,5,7,9,1};
//         System.out.println("LARGEST VALUE IS: " + largestvalue(numbers));

//     }
// }












public class pract{
    public static void main(String[] args){
        int n = 7;
        for(int i =1;i<=n;i++){
            for (int j =1;j<=n-i+1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}


