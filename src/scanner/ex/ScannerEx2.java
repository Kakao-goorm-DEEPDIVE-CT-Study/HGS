package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // 정수를 받는 입력 창
        System.out.print("하나의 정수를 입력하세요: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.print("입력한 숫자 " + number +"는 짝수입니다.");
        } else {
            System.out.print("입력한 숫자 " + number +"는 홀수입니다.");
        }
    }
}
