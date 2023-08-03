

 
// public class pract2{
//     public static int largestvalue(int numbers[]){
//         int largest=Integer.MIN_VALUE;  

//         for (int i=0;i<numbers.length;i++){
//             if (largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;

//     }
     
    
//     public static void main(String args[]){
//         int numbers[]={1,2,3,5,7,9,1};
     

//     }
// }



public class pract2{
    public static void revercearry(int numbers[]){
        int first = 0; int last = numbers.length-1;

        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;


        }

    }
    public static void main (String[] args) {
        int numbers[]={1,2,3,5,7,9};


        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

}