class pen{
    String colour;
    String type;

    public void penInfo(){
        System.out.println(this.colour);
        System.out.println(this.type);

    }
}
public class classandobjectcode {
    public static void main(String[] args){
    pen p1 = new pen();

    p1.colour="blue";
    p1.type="ball";
    
    pen p2 = new pen();

    p2.colour="red";
    p2.type="gel";

    p1.penInfo();
    p2.penInfo();
    
}
}