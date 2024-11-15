package Method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, Java";
        printmessage(message,3);
        System.out.println();
        printmessage(message,5);
        System.out.println();
        printmessage(message,7);
    }
    public static void printmessage(String message,int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

}

