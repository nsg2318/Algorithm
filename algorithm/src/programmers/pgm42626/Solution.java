package programmers.pgm42626;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
  public int solution(int[] scoville, int K) {
    Queue<Integer> scovilleQueue = new PriorityQueue<>();

    for (int i : scoville) {
      scovilleQueue.offer(i);
    }

    int counter = 0;

    while(!(scovilleQueue.element() >= K)){
      if(scovilleQueue.size() == 1){
        return -1;
      }
      Integer min = scovilleQueue.poll();
      Integer minNext = scovilleQueue.poll();
      scovilleQueue.offer(min+ minNext*2);
      counter++;
    }
    return counter;
  }
}

