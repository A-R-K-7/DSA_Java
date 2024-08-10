
import java.util.Stack;

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
    }
