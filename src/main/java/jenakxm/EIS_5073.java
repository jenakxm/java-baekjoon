package jenakxm;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class EIS_5073 {
    public void eis() {
        Scanner sc = new Scanner(System.in);
        String stop = "0 0 0";
        String doContinue;

        while(true){
            doContinue = sc.nextLine();

            if (doContinue.equals(stop)) {
                break;
            }

            String[] input = doContinue.split(" ");
            int[] numbers = new int[3];
            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(numbers);

            if (numbers[2] >= numbers[0] + numbers[1]) {
                System.out.println("Invalid");
                continue;
            }

            if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
                System.out.println("Equilateral");
                continue;
            } else if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
                System.out.println("Isosceles");
                continue;
            } else {
                System.out.println("Scalene");
                continue;
            }
        }
    }
}
