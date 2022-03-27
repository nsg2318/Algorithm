package programmers.pgmTest2;

import java.util.*;

public class Solution {
    public int solution(int[] stats) {
        List<Queue<Integer>> myList = new ArrayList<>();

        boolean check = false;
        for(int integer : stats){
            for(Queue<Integer> queue : myList){
                if(queue.element() < integer){
                    queue.add(integer);
                    check = true;
                    break;
                }
            }
            if(check){
                check = false;
            }
            else {
                Queue<Integer> myNewQueue = new PriorityQueue<>(new Comp());
                myNewQueue.add(integer);
                myList.add(myNewQueue);
                check =false;
            }
        }

        return myList.size();
    }

    class Comp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
