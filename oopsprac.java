 class Pen{
    String color;


}
public class oopsprac{

    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "black";
    }
}


class shape{
    public void area(){
        System.out.println("disply area");

    }
}
class Triangle extends shape {}
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }

}

class EquilateralTriangle extends Triangle {
    public void area (int l,int h){
        System.out.println(1/2*l*h);
    }
}


class Circle extends shape{
    public void area (int r){
        System.out.println(1/2*r*r);
    }

}

                                   

