import java.util.ArrayList;

import java.util.Scanner;

public class Boj1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double apowb;
        int apowbDvide;
        int bDvide;
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int a = scanner.nextInt(); //8
            long b = scanner.nextLong(); // 9
            if (a % 10 == 0){
                arrayList.add(10);
                arrayList.add(10);
                arrayList.add(10);
                arrayList.add(10);
                bDvide = 0;
            }
            else {
                for (int j = 1; j <= 4; j++) {
                    apowb = (double) Math.pow(a, j);
                    apowbDvide = (int) apowb % 10;
                    arrayList.add(apowbDvide);
                }
                if (b % 4 == 0) {
                    bDvide = 3;
                } else {
                    bDvide = (int) (b % 4) - 1;
                }
            }
            System.out.println(arrayList.get(bDvide));
        }
    }
}
