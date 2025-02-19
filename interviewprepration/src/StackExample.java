import java.util.*;

public class StackExample {
    public static void main(String[] args) {
       /* Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.peek()); //world
        System.out.println(stack.pop()); //world
        System.out.println(stack.peek()); //hello
        Queue<String> obj = new ArrayDeque<String>();
        obj.add("Hello");
        obj.add("World");
        System.out.println(obj.peek());*/
        Set<String> obj = new TreeSet<String>();
        obj.add("a");
        obj.add("d");
        obj.add("c");
        obj.add("e");
        obj.add("a");
        obj.add("b");
        obj.add("c");
        for (String obj1 : obj) {
            System.out.println(obj1);
        }

    }
}
