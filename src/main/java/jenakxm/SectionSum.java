package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SectionSum {
    public void addUP() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int times = scanner.nextInt();

        int[] numbers = new int[length];
        int[] answer = new int[times];

        for (int n = 0; n < length; n++) {
            numbers[n] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int[] added = new int[length+1];
        added[0] = 0;
        for (int i = 0; i < length; i++) {
            added[i+1] = added[i] + numbers[i];
        }
        System.out.println(Arrays.toString(added));

        for (int i = 0; i < times; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            answer[i] = added[to] - added[from-1];
        }

        for (int n : answer) {
            System.out.println(n);
        }

        // return Arrays.stream(numbers, 0, N).sum();
    }

    public void withBufferReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int arrayLength = Integer.parseInt(stringTokenizer.nextToken());
        int askNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] numArray = new long[arrayLength + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= arrayLength; i++) {
            numArray[i] = numArray[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int j = 0; j < askNo; j++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(numArray[n] - numArray[m - 1]);
        }
    }
}
