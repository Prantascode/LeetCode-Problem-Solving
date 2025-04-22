package Array;

class Fibonacci{
    int fibo(int n){
        int result;
        if (n == 0 || n == 1) {
            return n;
        }
        result = fibo(n-1)+ fibo (n-2);
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println("Fibonacci of 3 : "+f.fibo(3));
        System.out.println("Fibonacci of 5 : "+f.fibo(5));
    }
    
}
