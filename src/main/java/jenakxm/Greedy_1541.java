package jenakxm;

import java.util.Scanner;

public class Greedy_1541 {
    static int answer = 0;
    public void greedy() {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        String[] str = ex.split("-");

        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    static int mySum(String a) {
        int sum = 0;
        String temp[] = a.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
