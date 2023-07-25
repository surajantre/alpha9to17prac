// import java.util.*;
// public class prac {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);

//         int pencil = sc.nextInt();
//         int pen = sc.nextInt();
//         int eraser = sc.nextInt();

//         int totalBill=(pencil+pen+eraser);

//         float bill = (totalBill+(0.18f*totalBill));

//         System.out.println(bill);
//     }
// }




// import java.util.*;
// public class prac{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter n =");
//         int n = sc.nextInt();
//         System.out.println("enter = m");
//         int m = sc.nextInt();

//         System.out.println("enter operator =9");
//         char opretar = sc.next().charAt(0);

//         switch(opretar) {

//             case '+': System.out.println(n+m);
//             break;

//             case '-': System.out.println(n-m);
//             break;

//             case'*': System.out.println(n*m);
//             break;

//             case'/':System.out.println(n/m);
//             break;

//             default: System.out.println("wrong operator");
//         }
    
//     }
// }











class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}
public class prac{
    public static void main (String args[]){
    Student s1 = new Student();
    s1.name = "Suraj";
    s1.age = 22;

    s1.printInfo();
}
}