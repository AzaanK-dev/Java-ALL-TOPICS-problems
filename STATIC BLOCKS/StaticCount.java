// Create a class where static block initializes data and constructor modifies it differently
// for each object.

class A{
    static int count;
    static{
        count=10;
        System.out.println("count: "+count);
    }
    A(){
        count *= 2;
        System.out.println("count: "+count);
    }
}
public class StaticCount {
    public static void main(String[] args) {
        new A();
        new A();
    }
}