package Recursion.GFG_Factorial;

class Factorial {
    int fact(int n){
        int result;
        if (n <= 1) {
            return 1;
        }
        result = n * fact (n-1);
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 3 : "+f.fact(3));
        System.out.println("Factorial of 5 : "+f.fact(5));
    }
}
