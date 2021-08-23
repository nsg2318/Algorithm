import java.util.Scanner;

public class Boj1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] inputs = new int[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            inputs[i] = scanner.nextInt();
            if (max < inputs[i]) {
                max = inputs[i];
            }
        }

        // make fibo arrays
        int[] fibo = new int[Math.max(max, 3)];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 2;
        for (int i = 3; i < max; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for (int i = 0; i < T; i++) {
            if (inputs[i] == 1) {
                System.out.println("0 1");
            } else if (inputs[i] == 0) {
                System.out.println("1 0");
            } else {
                System.out.println(fibo[inputs[i] - 2] + " " + fibo[inputs[i] - 1]);
            }
        }
    }
}