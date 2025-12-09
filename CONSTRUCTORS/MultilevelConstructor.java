// Create a multilevel constructor chain (3 classes) where parameterized constructors call
// different superclass constructors selectively.

class A{
    int nameOfCategory;
    A(){
        System.out.println("Default contructor A.");
    }
    A(int n){
        nameOfCategory = n;
        System.out.println("Parameterized contructor A.");
    }
}
class B extends A{
    int nameOfSubCategory;
    B(){
        System.out.println("Default contructor B.");
    }
    B(int n1,int n2){
        super(n1);
        nameOfSubCategory = n2;
        System.out.println("Parameterized contructor B.");
    }
}
class C extends B{
    int nameOfLastCategory;
    C(){
        System.out.println("Default contructor C.");
    }
    C(int n1,int n2,int n3){
        super(n1,n2);
        nameOfLastCategory = n3;
        System.out.println("Parameterized contructor C.");
    }
}
public class MultilevelConstructor{
    public static void main(String[] args) {
        new C(10, 20, 30);
    }
}