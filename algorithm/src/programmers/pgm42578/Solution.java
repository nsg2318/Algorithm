package programmers.pgm42578;

import java.util.HashMap;
import java.util.Map;

//[["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]
public class Solution {
  public int solution(String[][] clothes) {
    Map<String, Integer> myMap = new HashMap<>();
    for (String[] clothe : clothes) {
      String target = clothe[1];
      if (myMap.get(target) == null) {
        myMap.put(target, 1);
      } else {
        Integer integer = myMap.get(target);
        myMap.remove(target);
        myMap.put(target, integer + 1);
      }
    }

    myMap.forEach((s, i) -> System.out.println(s + ", " + i));

    System.out.println(myMap.keySet());


    int answer = 0;
    return answer;
  }
}
