// Using Array
package Stack;
class Stack{
    int top , cap;
    int [] a;
    public Stack(int cap){
        this.cap = cap;
        top = -1;
        a = new int[cap];
    }
    //Push
    public int push(int x){
        if (top >= cap-1) {
            System.out.println("Stack Overflow");
            return 0;
        } 
        return a[++top] = x;
    }
    //pop
    public int pop(){
        if (top < 0) {
            System.out.println("Stack is Underflow");
            return 0;
        }
        return a[top--];
    }
    //Peek
    public int peek(){
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top];
    }
    //check if Stack is empty or Not 
    public boolean isEmpty(){
        return top < 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Stack stack =  new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Pop from Stack");
        System.out.println("Top element is "+stack.peek());
        System.out.print("Elements in the Stack : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.peek()+" ");//Peek 1st then pop
            stack.pop();
        }
    }
}
