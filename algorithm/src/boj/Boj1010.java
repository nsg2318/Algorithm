package boj;

import java.util.Scanner;

public class Boj1010 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      int son = 1;
      for (int j = 0; j < n; j++) {
        son *= m-i;
      }
      System.out.println(son/factorial(n));
    }
  }

  static int factorial(int a){
    int fac = 1;
    for (int i = 1; i <= a; i++) {
      fac *= i;
    }
    return fac;
  }
}
