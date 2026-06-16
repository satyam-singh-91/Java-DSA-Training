package Stack;

import java.util.Stack;

public class Create {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Stack<String> s1 = new Stack<>();
        /*
         * s.push(10);
         * s.push(20);
         * s.push(30);
         * s.push(40);
         * 
         * System.out.println(s);
         * System.out.println(s.peek());
         */
        s.push("Divyansh");
        s.push("Akash");
        s.push("Kishan");
        s.push("Ajay");
        s.push("Arshad");
        s1.push(s.pop());
        s1.push(s.pop());


        System.out.println(s);
        System.out.println(s1);
    }
}
