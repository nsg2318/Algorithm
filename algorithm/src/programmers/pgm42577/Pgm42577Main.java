package programmers.pgm42577;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Pgm42577Main {
    public static void main(String[] args) {
//        String[] input = {"12", "123", "1235","567","88"};
        String[] input = {"119", "996742", "11955231"};
        //["12","123","1235","567","88"]
        Solution solution = new Solution();
        boolean result = solution.solution(input);
        System.out.println("result = " + result);
        
    }
}

class Solution {
    public boolean solution(String[] phone_book) {

        boolean mybool = true;
        Arrays.sort(phone_book);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
        }
        for ( String phoneNum : phone_book ) {
            for (int i = 0; i < phoneNum.length()-1; i++) {
                String slice = phoneNum.substring(0, i + 1);
                if (set.contains(slice)) {
                    mybool = false;
                    break;
                }
            }
        }
        return mybool;
    }
}