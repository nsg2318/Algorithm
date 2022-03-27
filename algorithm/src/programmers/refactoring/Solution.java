package programmers.refactoring;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String solution(String encrypted_text, String key, int rotation) {
        Deque<Integer> myQueueInt = new LinkedList<>();
        for (int i = 0; i < encrypted_text.length(); i++) {
            String substring = encrypted_text.substring(i, i + 1);
            int a = substring.charAt(0);
            myQueueInt.add(a);
        }

        if(rotation < 0){
            for (int i = 0; i < -rotation; i++) {
                Integer integer = myQueueInt.pollLast();
                myQueueInt.addFirst(integer);
            }
        }
        else {
            for (int i = 0; i < rotation; i++) {
                Integer integer = myQueueInt.pollFirst();
                myQueueInt.addLast(integer);
            }
        }

        Queue<Integer> myKeyInt = new LinkedList<>();
        for (int i = 0; i < key.length(); i++) {
            String substring = key.substring(i, i + 1);
            int a = substring.charAt(0);
            myKeyInt.add(a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!myQueueInt.isEmpty()) {
            Integer poll = myQueueInt.poll();
            Integer poll1 = myKeyInt.poll();
            if (poll >= poll1) {
                char i1 = (char) (poll - poll1 + 96);
                stringBuilder.append(i1);
            }
            else {
                char i2 =(char)(poll - poll1 + 122);
                stringBuilder.append(i2);
            }
        }
        return stringBuilder.toString();
    }
}
