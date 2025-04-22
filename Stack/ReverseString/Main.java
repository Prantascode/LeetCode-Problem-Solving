package Stack.ReverseString;

class Stk{
    int top , cap;
    char [] str;
    public Stk(int n){
        top = -1;
        cap = n;
        str = new char[cap];
    }
    boolean push(char x){
        if (top >= cap - 1) {
            System.out.println("Stack Overflow");
            return false;
        }else{
            str[++top] = x;
            return true;
        }
    }
    char pop(){
        if (top < 0) {
            System.out.println("Stack is Underflow");
            return 0;
        }else
            return str[top--];
    }
    char peek(){
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }else{
            return str[top];
        }
    }
    boolean isEmpty(){
        return (top < 0);
    }
}
public class Main {
    public static void main(String[] args) {
        String s = "GeeksQuiz";
        int n = s.length();
        Stk Obj = new Stk(n);
        for (int i = 0; i < n; i++) {
            Obj.push(s.charAt(i));
        }
        System.out.print("Reverse String : ");
        while (!Obj.isEmpty()) {
           System.out.print(Obj.pop());
           
        }
         
    }
}
