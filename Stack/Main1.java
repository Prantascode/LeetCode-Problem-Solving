//Using ArrayList
package Stack;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer>  s = new ArrayList<Integer>();
        //Push
        s.add(10);
        s.add(20);
        s.add(30);

        //Pop
        System.out.println(s.get(s.size()-1)+" Pop from Stack");
        s.remove(s.size() - 1);
        //peek
        System.out.println("Top element is "+s.get(s.size()-1));
        System.out.print("Elements in the Stack : ");
        while (!s.isEmpty()) {
            System.out.print(s.get(s.size()-1)+ " "); // Peek Then Pop until stack will empty
            s.remove(s.size()-1);
        }               
    }
}
