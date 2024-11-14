package ZoomEx;

public class Ex126_PiExample {

    public static void main(String[] args) {
        int insdieCount = 0;

        for (int i = 1; i < 1000000; i++) {
            double x = Math.random();
            double y = Math.random();

            if (x * x + y * y <=1 ) {
                insdieCount += 1;
            }
                double pi = (double)4*insdieCount/i;

                String text = String.format("[%d] Pi = %.6f", i,pi );
            System.out.println(text);
            }
        }
    }

