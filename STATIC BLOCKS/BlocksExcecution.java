// Implement a class with 3 static blocks, 2 instance blocks, and 1 constructor — predict exact output order

class Test{
    static{ System.out.println("Static block 1"); }
    static{ System.out.println("Static block 2"); }
    static{ System.out.println("Static block 3"); }
    { System.out.println("Instance block 1"); }
    { System.out.println("Instance block 2"); }
    Test(){
        System.out.println("Constructor");
    }
}
public class BlocksExcecution{
    public static void main(String[] args) {
        new Test();  // staic only runs when class loads first without object creation. 
        new Test();
    }
}