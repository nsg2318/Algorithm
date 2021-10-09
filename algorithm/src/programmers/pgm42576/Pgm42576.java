package programmers.pgm42576;
import java.util.Arrays;

public class Pgm42576 {
    public String solution(String[] participant, String[] completion) {

        String result = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int plen = participant.length;
        int clen = plen-1;
        if(participant[plen-2].equals(completion[clen-1])){
            result = participant[plen-1];
        }
        System.out.println(result);
        for(int i = 0; i < clen; i++ ){

            if(!participant[i].equals(completion[i])){
                result = participant[i];
                break;
            }
        }
        return result;
    }
}
