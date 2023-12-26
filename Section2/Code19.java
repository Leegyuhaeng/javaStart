package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) {

        String[] name = new String[1000];
        String[] number = new String[1000];

        int n = 0;

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

        for (int i=0; i<n; i++) {
            System.out.println(name[i]+ ":" + number[i] );
        }
    }
}
