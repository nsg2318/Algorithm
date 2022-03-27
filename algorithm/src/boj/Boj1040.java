package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double target = scanner.nextDouble();
        int kindNumber = scanner.nextInt();
        int targetLength = Double.toString(target).length();

        List<Integer> numberList = new ArrayList<>();
        List<Integer> selectedList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        if(targetLength < kindNumber){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("10");

            for (int i = 0; i < kindNumber-2; i++) {
                stringBuilder.append(i+2);
            }
            System.out.println(stringBuilder);
        }
        else {

        }
    }
}
