import java.util.*;
 interface Function {
     int cal(int x,int y);

    
}

public class May27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Function add = (x, y) -> x + y;
        Function sub = (x, y) -> x - y;
        Function mul = (x, y) -> x * y;
        Function div = (x, y) -> x / y;

        System.out.println("Addition = " + add.cal(a, b));
        System.out.println("Subtraction = " + sub.cal(a, b));
        System.out.println("Multiplication = " + mul.cal(a, b));
        try{
        System.out.println("Division = " + div.cal(a, b));
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}