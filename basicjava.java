// import java.util.*;
// public class basicjava {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int sum = a+b+c;
//         int average = sum/3;

//         System.out.println("average ogf given tree number: " + average);

      
//     }
    
// }



// import java.util.*;
// public class basicjava{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         System.out.println("area of square = "+ a*a);
//     }
// }


// import java. util.*;

// import javax.sound.sampled.SourceDataLine;
// public class basicjava{


//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int pen = sc.nextInt();
//         int pencil = sc.nextInt();
//         int eraser = sc.nextInt();

//         int gst = pen+pencil+eraser*0.18;

//         int totalbill = pen+pencil+eraser+gst;

//         System.out.println("total bill = "+ totalbill);

//     }

// }





// import java.util.*;
// public class basicjava{
//     public static void main(String []args){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         if(n >= 0){
//             System.out.println("given number is positive");
//         }

//             else {
//                 System.out.println("given number is negative");

//             }


//     }
// }



// public class basicjava{
//     public static void main(String args[]){
//         double temp = 97;
//         if(temp <= 100){
//             System.out.println("you have a don't fever");
//         }else{
//             System.out.println("you have a fever");

//         }

//     }

// }




import java.util.*;
public class basicjava{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1 : System.out.println("snday"); break;
            case 2 : System.out.println("monday"); break;
            case 3 : System.out.println("   tuesday"); break;
            case 4 : System.out.println("wednesday"); break;
            case 5 : System.out.println("thusday"); break;
            case 6 : System.out.println("friday"); break;
            case 7 : System.out.println("Saterday");break;

            default: System.out.println("wrong number");

        }
    }
}