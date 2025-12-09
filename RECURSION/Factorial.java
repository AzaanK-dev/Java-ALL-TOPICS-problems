//30. Implement a recursive factorial that counts how many recursive calls were made.

public class Factorial {
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("Factorial: "+res);
        System.out.println("Recursive calls: "+count);
    }
    static int f=1;
    static int count=0;

    public static int factorial(int n){
        count++;  
        if(n==1) return 1;
        f = n*factorial(n-1);
        return f;
    }
}