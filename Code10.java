public class Code10 {
    //    소수 구하기
    public static void main(String[] args) {
        for (int n = 2; n <= 100000; n++) {
            boolean isPrime = true;
//          break 문
//                for (int i = 2; i <= n / 2; i++) {
//                    if (n % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//
//          for 문 조건 걸기
//                for (int i = 2; i <= n / 2 && isPrime; i++) {
//                    if (n % i == 0)
//                        isPrime = false;
//                }
//          루트 계산법
                for (int i = 2; i * i <= n && isPrime; i++) {
                    if (n % i == 0)
                        isPrime = false;
                }
                if (isPrime) System.out.println(n);
        }
    }
}
