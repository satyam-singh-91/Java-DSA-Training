package Stack;

import java.util.Stack;

public class Create {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
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

        System.out.println(s);
    }
}
