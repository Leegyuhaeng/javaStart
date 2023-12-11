import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        String str = "Hello";
        String input = null;

        Scanner kb = new Scanner(System.in);
        System.out.print("Please type a string");
        input = kb.next();
//        nextInt 란 입력값을 받은 StringType 의 첫번째 문자열을 가져온다
//        자바에서 비교연산자 == 는 Primitive  Type 들을 비교할때 사용할수있다
        if(str.equals(input)) {
            System.out.println("Strings match!");
        } else {
            System.out.println("Strings do not match! :");
        }
        kb.close();
    }
}