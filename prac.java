import java.util.*;
public class prac {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();

        int totalBill=(pencil+pen+eraser);

        float bill = (totalBill+(0.18f*totalBill));

        System.out.println(bill);
    }
}
