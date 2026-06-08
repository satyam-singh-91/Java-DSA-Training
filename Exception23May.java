public class Exception23May {
    public static void main(String[] args){
        try {
            int a = 5/0;
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide a number by zero");
        }
        finally {
            System.out.println("This block will always execute");
        }
      
    }
}
