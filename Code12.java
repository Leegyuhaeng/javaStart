import java.util.Scanner;
// 구간에서의 가장큰 합 찾기
// [124,-2,3,5,-14,12,3,-9,8,-1,13,2,-5,4]
public class Code12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int[n];
        for (int i=0; i<n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();
        int maxSum = 0;
        int count = 0;
//        for(int i=0; i<n; i++) {
//            for (int j=i; j<n; j++) {
//                int sum = 0;
//                for (int k=i; k<=j; k++)
//                    sum += data[k];
//
//                if(sum > maxSum)
//                    maxSum = sum;
//            }
//        }
        for(int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum+=data[j];
                count++;
                if(sum > maxSum)
                    maxSum = sum;
            }
        }
        System.out.println("The max sum is" + maxSum);
        System.out.println("count" + count);
    }
}
