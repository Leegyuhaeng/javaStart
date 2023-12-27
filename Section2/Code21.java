package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {
    static int n;
    static int [][]grid;
    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("data"));
            n = inFile.nextInt();
            grid = new int[n][n];
            for (int i=0; i<n; i++)
                for (int j=0; j<n; j++)
                    grid[i][j] = inFile.nextInt();
            inFile.close();
            //        x 가로 좌표 y 세로 좌표 dir 방향 (북,북동,동,동남,남,남서,서,서북),length 길이
            for (int x=0; x<n; x++){
                for (int y=0; y<n; y++){
                    for (int dir=0; dir<8; dir++){
                        for (int length=1; length<=n; length++){
                            int value = computeValue(x,y,dir,length);
                            if (value != -1 && isPrime(value))
                                System.out.println(value);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int computeValue(int x, int y, int dir, int len) {
        int value = 0;
        for (int i=0; i<len; i++) {
            int digit = getDigit(x,y,dir,i);
            if(digit == -1)
                return -1;
            value = value * 10 + digit;
        }
        return value;
    }
    public static int getDigit(int x, int y, int dir, int i) {
        // 방법 1
        // 좌표 x,y 에서 dir 방향으로 i 칸 떨어진 숫자를 가져와서 리턴하는 함수
        int newX = x, newY = y;
        switch (dir) {
            case 0: newY -= i; break;
            case 1: newX += i; newY -= i; break;
            case 2: newX += i; break;
            case 3: newX += i; newY += i; break;
            case 4: newY += i; break;
            case 5: newX -= i; newY += i; break;
            case 6: newX -= i; break;
            case 7: newX -= i; newY -= i; break;
        }
        if (newX < 0 || newX >= n || newY < 0 || newY >= n )
            return -1;
        return grid[newX][newY];

        // 방법 2
//         int [] offsetX = {0,1,1,1,0,-1,-1,-1};
//         int [] offsetY = {-1,-1,0,1,1,1,0,-1};
//         int newX = x+i*offsetX[dir] , newY = y+i*offsetY[dir];
//        if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length )
//            return -1;
//        else
//            return grid[newX][newY];

    }
    public static boolean isPrime(int value) {
        boolean isPrime = true;
        for (int i = 2; i * i <= value && isPrime; i++) {
            if (value % i == 0)
                isPrime = false;
        }
        return isPrime;
    }
}
