package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindGoodNumber {
    public void findTheNumber() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] numArray = new int[num];
        for (int i = 0; i < num; i++) {
            numArray[i] = scanner.nextInt();
        }

        Arrays.sort(numArray);
        int count = 0;

        for (int n = 0; n < num; n++) {
            int i = 0;
            int j = num -1;
            int k = numArray[n];
            while (i < j) {
                if (numArray[i] + numArray[j] == k) {
                    if (i != n && j != n) {
                        count++;
                        break;
                    } else if (i == n) {
                        i++;
                    } else if (j == n) {
                        j--;
                    }
                } else if (numArray[i] + numArray[j] < k) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }

    public void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int result = 0;
        int[] a = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        for (int k = 0; k < N; k++) {
            int find = a[k];
            int i = 0;
            int j = N-1;

            while (i < j) {
                if (a[i] + a[j] == find) {
                    if (i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (a[i] + a[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        bf.close();
    }
}
