package programmers.pgm42627;

import java.util.*;

public class Solution {
  public int solution(int[][] jobs) {
    int count = 0;
    int waitSum = 0;
    List<int[]> totalList = new ArrayList<>(Arrays.asList(jobs));
    while(!totalList.isEmpty()) {
      Queue<int[]> myJobs = new PriorityQueue<>(new ArrayComp2());
      for (int i = 0; i < totalList.size(); i++) {
        if (totalList.get(i)[0] <= count) {
          myJobs.offer(totalList.get(i));
        }
      }
      if (myJobs.isEmpty()){
        int[] ints = totalList.stream().min(new ArrayComp1()).get();
        totalList.remove(ints);
        count = ints[0]+ints[1];
        waitSum += ints[1];
      }
      else {
        int[] poll = myJobs.poll();
        totalList.remove(poll);
        count += poll[1];
        waitSum += count - poll[0];
      }
    }
    return waitSum / jobs.length;
  }
}

class ArrayComp1 implements Comparator<int[]> {
  @Override
  public int compare(int[] o1, int[] o2) {
    if (o1[0] == o2[0]) {
      return o1[1] - o2[1];
    } else return o1[0] - o2[0];
  }
}

class ArrayComp2 implements Comparator<int[]> {
  @Override
  public int compare(int[] o1, int[] o2) {
    if (o1[1] == o2[1]) {
      return o1[0] - o2[0];
    } else return o1[1] - o2[1];
  }
}