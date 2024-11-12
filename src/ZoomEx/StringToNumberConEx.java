package ZoomEx;

public class StringToNumberConEx {
    public static void main(String[] args) {
        //문자열을 정수로 변환
        String intString = " 123 ";
        int intValue = Integer.parseInt(intString.trim());
        System.out.println("정수 값: " + intValue);
        //문자열을 실수로 변환
        String doubleString = "123.45 ";
        double doubleValue = Double.parseDouble(doubleString.trim());
        System.out.println("실수 값: " + doubleValue);


        double  dou = 9.7;
        // double -> int  강제 형 변환
        int ite = (int) dou;
        System.out.println(ite);
    }
}
