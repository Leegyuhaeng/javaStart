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

        int maxPrime = 0;
        for(int i=0; i<n; i++) {
            int val  = 0;
            for(int j=i;j<n;j++) {
//                for(int k=i; k<=j; k++) {
//                    val = val * 10 + data[k];
//                }
                val = val * 10 + data[j];
                boolean isPrime = true;
                for(int p=2; p < val/2 && isPrime; p++) {
                    if(val % p==0) isPrime = false;
                }
                if (isPrime && val > 1 && val > maxPrime) {
                    maxPrime = val;
                }
            }
        }
        if(maxPrime > 0) {
            System.out.println("The max prime number is" + maxPrime);
        } else {
            System.out.println("No Prime number exists");
        }
    }
}
