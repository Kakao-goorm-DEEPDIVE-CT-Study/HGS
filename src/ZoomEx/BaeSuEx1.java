package ZoomEx;

public class BaeSuEx1 {

    public static void main(String[] args) {
        int [] num = new int [10];

        for (int i=0; i <  num.length; i++) {
            num[i] = (i + 1) * 10;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
