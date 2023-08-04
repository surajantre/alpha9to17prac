 
 import java.util.*;
 public class thus0308{
    public static void binarySearch(int arr[],int key){
         int start = 0; int end = arr.length-1;

         if(start<=end){
            int mid = (start+end)/2;

            if (arr[mid]==key){
                 System.out.println(mid);

            }

            if(arr[mid]<key){
                start = mid+1;
                System.out.println(key);
                
            }else{
                end = mid - 1;
                System.out.println(key);
                 
            }
         }
         System.out.println("key not found");
         
         //System.out.println("key not found");
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,6,7,9};
        int key=8;
        binarySearch(arr, key);
    }
 }