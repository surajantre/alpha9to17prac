// public class patterns {
    
 
//     public static void hello_rectangle(int totRows,int totCols){
//         for(int i=0;i<=totRows;i++){
//             for(int j=0;j<=totCols;j++){
//                 if(i==1||i==totRows||j == 1|| j==totCols ){
//                     System.out.print("*");
//                 }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();

//         }
//     }
//     public static void main(String[] args){
//          hello_rectangle(10, 7);

//     }
// }

// public class patterns{
//     public static void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-1;j++){
//                 System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    
//     }
    
//     public static void main(String[] args){
//         pattern(9);


//         }

//     }




// public class patterns{
//     public static void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//         }
//         for(int j=1;j<=n;j++){
//             System.out.print(" ");
//         }
//         System.out.println();
//     }
    
//     }
    
//     public static void main(String[] args){
//         pattern(4);


//         }

//     }




// public class patterns{

//     public static void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);

//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print( " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         pattern(4);


//     }
// }




public class patterns{
    public static void pattern(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(counter+"  ");
                counter++;
        }
        System.out.println();
    }
     
}
    public static void main(String args[]){
        pattern(5);

    }
}