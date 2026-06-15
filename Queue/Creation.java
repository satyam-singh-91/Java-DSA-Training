package Queue;
import java.util.*;

public class Creation {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.add(4);
        num.add(3);
        num.add(1);
        num.add(2);
        System.out.println(num);
        num.offer(6);
        System.out.println(num);
        System.out.println(num.peek()); 
        System.out.println(num.poll());
        System.out.println(num);

    }
}