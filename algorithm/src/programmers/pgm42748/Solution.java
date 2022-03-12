package programmers.pgm42748;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
  public int[] solution(int[] array, int[][] commands) {
    int[] result = new int[commands.length];
    List<Integer> arrayList = new ArrayList<>();
    for (int j : array) {
      arrayList.add(j);
    }

    for (int k = 0; k < commands.length; k++) {
      Queue<Integer> pq = new PriorityQueue<>();
      for (int i = commands[k][0]-1; i <= commands[k][1]-1; i++) {
        pq.offer(arrayList.get(i));
      }
      for (int i = 0; i < commands[k][2] - 1; i++) {
        pq.poll();
      }
      result[k] = pq.poll();
    }
    return result;
  }
}