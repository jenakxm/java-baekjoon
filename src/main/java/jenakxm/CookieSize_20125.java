package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CookieSize_20125 {
    static int heartX = 0;
    static int heartY = 0;
    static int armL = 0;
    static int armR = 0;
    static int waist = 0;
    static int legL = 0;
    static int legR = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        String[][] board = new String[N + 1][N + 1];
        char[] temp;

        boolean flag = false;

        for (int i = 1; i < N + 1; i++) {
            temp = bf.readLine().toCharArray();
            for (int j = 1; j < N + 1; j++) {
                board[i][j] = String.valueOf(temp[j-1]);
                if (!flag && board[i][j].equals("*")) {
                    flag = true;
                    heartX = i+1;
                    heartY = j;
                    sb.append(heartX + " " + heartY + "\n");
                }
            }
        }


        for (int j = 1; j < heartY; j++) {
            if (board[heartX][j].equals("*")) {
                armL++;
            }
        }

        for (int j = heartY + 1; j < N + 1; j++) {
            if (board[heartX][j].equals("*")) {
                armR++;
            }
        }

        for (int i = heartX + 1; i < N + 1; i++) {
            if (board[i][heartY].equals("*")) {
                waist++;
            }
        }

        for (int i = heartX + waist + 1; i < N + 1; i++) {
            if (board[i][heartY-1].equals("*")) {
                legL++;
            }
        }

        for (int i = heartX + waist + 1; i < N + 1; i++) {
            if (board[i][heartY+1].equals("*")) {
                legR++;
            }
        }

        sb.append(armL + " " + armR + " " + waist + " " + legL + " " + legR);

        System.out.println(sb);
    }
}
