import java.util.Scanner;
public class Code02 {
    public static void main(String[] args) {
        int number = 123;
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter an integer");
        int input = kb.nextInt();
//        nextInt 란 입력값을 받은 intType 의 첫번째 숫자열을 가져온다
//        자바에서 비교연산자 == 는 Primitive Type 들을 비교할때 사용할수있다
        if(input == number) {
            System.out.println("Numbers match!:-)");
        } else {
            System.out.println("Numbers do not match!");
        }
        kb.close();
    }
}