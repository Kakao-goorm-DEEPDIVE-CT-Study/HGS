package ZoomEx;

public class BaeSuEx2 {

    public static void main(String[] args) {
        int [] num = new int [9];
        int index = 0;

        int a = 98;
        int b = 2;
        String ineq = ">";
        String eq = "=";

        if ((ineq+eq).equals(">=")) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        System.out.println(ineq+eq);

        int num1 =  a / b;
        System.out.println(num1);



        for (int i=11; i <=  100; i+= 11) {
            num[index++] = i; // 11의 배수 선언
        }

        // 배열의 값 출력
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }



    }
}
