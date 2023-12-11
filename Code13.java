import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int[n];

        for(int i=0; i<n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        int max = 0;
        for (int i=0; i<n; i++) {
        int num = 0;
            for (int j=i; j<i; j++) {
                num = num * 10 + data[j];
                boolean isPrime = true;
                for (int p=2; p < num/2 && isPrime; p++) {
                    if(num % p == 0) isPrime = false;
                }
                if(isPrime && num > 1 && num > max ) max = num;
            }
        }
        if(max > 0) {
            System.out.println("The max prime number is" + max);
        } else {
            System.out.println("No Prime number exists");
        }
    }
}
