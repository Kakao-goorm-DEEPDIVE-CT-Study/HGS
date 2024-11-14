package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int temp = 0;

       //temp <= 10;
       temp = a;
       //a <= 20;
       a = b;
       //b = 10;
       b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
