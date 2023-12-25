package Section2;

import java.util.Scanner;

public class Code18 {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int [n];
        for(int i=0; i<n;i++)
            data[i] = kb.nextInt();
        kb.close();

        bubbleSort(n,data);

        System.out.println("Sorted data:");
        for(int i=0; i<n; i++)
            System.out.println(data[i]);
    }

    static void bubbleSort(int n, int[] array) {
        //https://st-lab.tistory.com/195
        for(int i = n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(array[j] > array[j+1]) {
                    // swap data[j] and data[j+1]
                    swap(array[j],array[j+1]);
                }
            }
        }
    }
    static void swap(int a , int b) {
//        primytive type 이라 참조된 데이터가 아닌 깊은 복사된 데이터라 해당 배열의 값이 바뀌지 않아 sort 가 되지않는다
       int tmp = a;
       a = b;
       b = tmp;
//       ==========================================================
//        int tmp = array[j];
//        array[j] = array[j+1];
//        array[j+1] = tmp;
    }
}