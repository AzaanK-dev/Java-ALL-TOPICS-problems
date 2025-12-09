// Create a Fraction class containing numerator and denominator. Write a method that multiplies two Fraction objects and returns the result as a new Fraction.

public class FractionMultiplier {
    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }

        public String toString() {
            return num + "/" + den;
        }
    }

    public static Fraction fracMul(Fraction frac1, Fraction frac2) {
        int nr = frac1.num * frac2.num;
        int dr = frac1.den * frac2.den;
        Fraction res = new Fraction(nr, dr);
        return res;
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction ans = fracMul(f1, f2);
        System.out.println(ans);
    }
}
