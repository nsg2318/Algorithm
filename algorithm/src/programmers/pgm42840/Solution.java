package programmers.pgm42840;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int[] solution(int[] answers) {

    int[] person1 = {1,2,3,4,5};
    int[] person2 = {2,1,2,3,2,4,2,5};
    int[] person3 = {3,3,1,1,2,2,4,4,5,5};
    int counter1 = counter(person1, answers);
    int counter2 = counter(person2, answers);
    int counter3 = counter(person3, answers);

    int max = counter1;
    if (counter2 > max){
      max = counter2;
    }
    if (counter3 > max) {
      max = counter3;
    }

    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(counter1);
    arrayList.add(counter2);
    arrayList.add(counter3);

    List<Integer> arrayListResult = new ArrayList<>();
    for (int i = 0; i < arrayList.size(); i++) {
      if(max == arrayList.get(i)){
        arrayListResult.add(i);
      }
    }

    int[] result = new int[arrayListResult.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = arrayListResult.get(i)+1;
      System.out.println(result[i]);
    }

    return result;
  }

  public static int counter(int[] pattern, int[] answers){
    int count = 0;
    if(answers[0]==pattern[0]){
      count++;
    }
    for (int i = 1; i < answers.length; i++) {
      if(answers[i]==pattern[i% pattern.length]){
        count++;
      }
    }
    return count;
  }
}
