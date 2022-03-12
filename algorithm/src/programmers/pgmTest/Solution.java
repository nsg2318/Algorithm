package programmers.pgmTest;

import java.util.*;

public class Solution {
//    public String solution(String encrypted_text, String key, int rotation) {
//        LinkedList<String> myList = new LinkedList<>();
//        Deque<Integer> myQueueInt = new LinkedList<>();
//        for (int i = 0; i < encrypted_text.length(); i++) {
//            String substring = encrypted_text.substring(i, i + 1);
//            int a = substring.charAt(0);
//            myQueueInt.add(a);
//            myList.add(substring);
//        }
//
//        if(rotation < 0){
//            for (int i = 0; i < -rotation; i++) {
//                String s = myList.pollLast();
//                Integer integer = myQueueInt.pollLast();
//                myList.addFirst(s);
//                myQueueInt.addFirst(integer);
//            }
//        }
//        if (rotation >= 0){
//            for (int i = 0; i < rotation; i++) {
//                String s = myList.pollFirst();
//                Integer integer = myQueueInt.pollFirst();
//                myList.addLast(s);
//                myQueueInt.addLast(integer);
//            }
//        }
//
//        Queue<Integer> myKeyInt = new LinkedList<>();
//        for (int i = 0; i < key.length(); i++) {
//            String substring = key.substring(i, i + 1);
//            int a = substring.charAt(0);
//            myKeyInt.add(a);
//        }
//
//        StringBuffer stringBuffer = new StringBuffer();
//
//        while(!myQueueInt.isEmpty()) {
//            Integer poll = myQueueInt.poll();
//            Integer poll1 = myKeyInt.poll();
//            if (poll >= poll1) {
//                char i1 = (char) (poll - poll1 + 96);
//                stringBuffer.append(i1);
//            }
//            else {
//                char i2 =(char)(poll-poll1+122);
//                stringBuffer.append(i2);
//            }
//        }
//        return stringBuffer.toString();
//
//    }
}
