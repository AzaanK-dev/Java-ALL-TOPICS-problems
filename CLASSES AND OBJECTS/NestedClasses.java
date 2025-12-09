// Create nested classes: Outer (University), Inner (Department), Static (Library). Control access between them.

class University{
    String uniName="Karachi University";
    class Depart{
        String depName = "UBIT";
        void display(){
            System.out.println(uniName);
            System.out.println(depName);
        }
    }
    static class Library{
        String libName="Mahmud Hussain";
        void displayLib(){
            System.out.println(libName);
        }
    }
}
public class NestedClasses {
    University u = new University();
    University.Depart d = u.new Depart(); // Direct creating Object of inner class Depart
    University.Library l = new University.Library(); // cant create direct object bcz class is static (Thus using nested Object)
}