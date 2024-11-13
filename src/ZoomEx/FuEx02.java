package ZoomEx;

public class FuEx02 {
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("짝수");
            return;
        }
        //홀수인 경우 실행되는 코드
        System.out.println("홀수");
    }

    public static void main(String[] args) {
        checkEvenOrOdd(4);
        checkEvenOrOdd(7);
    }
}
