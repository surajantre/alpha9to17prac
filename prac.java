// import java.util.Scanner;

// public class prac {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         char operator = sc.next().charAt(0);

//         switch(operator) {
//             case '+':System.out.println(a+b);
//             break;

//             case '-':System.out.println(a-b);
//             break;

//             case '*':System.out.println(a*b);
//             break;

//             case'/': System.out.println(a/b);
//             break;

//             case'%':System.out.println(a%b);
//             break;

//            default:
//            System.out.println("your oprtator are rong");
           

//         }
//     }
// }




// public class prac{
//     public static void main(String[] args ){
//         int i = 1;

//         while(i<= 10000){
//             System.out.print(i+" ");
//             i++;
//         }
//         System.out.println();
//     }
// }

import java.util.*;

public class prac{
    public static void main(String[] args){
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();

        int sum = 0;
        int i = 1;

        while(i<= n){
            sum += i;
            i++;
        }

        System.out.println("sum is   "  + sum);
    }
}

