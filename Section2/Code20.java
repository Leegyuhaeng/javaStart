package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("input"));

            //inFile.hasNext() 더 읽을게 있으면 true return 아니면 false return
            while (inFile.hasNext()) {
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();
        }catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
//            System.exit 프로그램 종료 (아무숫자 0 은 정상종료라는뜻)
//            return 으로 대체 가능 하지만 좀더 명확하게 System.exit 를 사용
        }
        bubbleSort();
        for (int i=0; i<n; i++) {
            System.out.println(name[i]+ ":" + number[i] );
        }
    }
    static void bubbleSort() {
        for (int i = n-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if(name[j].compareTo(name[j+1]) > 0) {
                    String tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tmp;

                    tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
    }
}
