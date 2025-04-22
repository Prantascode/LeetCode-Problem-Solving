package LinkedList;

import java.util.*;

public class LLCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");
        list.addLast("Pranta");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +" -> ");
        }
        System.out.println("Null");
        list.removeLast();
        System.out.println(list);
    }
}
