import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

// Fail............
public class Boj1016 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //사람의 수
        int playerNum = scanner.nextInt();
        //파티의 수
        int partyNum = scanner.nextInt();
        //진실을 아는사람 수
        int known = scanner.nextInt();
        //진실을 아는사람 번호 리스트
        ArrayList<Integer> knownId = new ArrayList<Integer>(known);
        for (int i=0; i < known; i++) {
            knownId.add(scanner.nextInt());
        }
//        int zeroparty = 0;
//        System.out.println(playerNum);

        // 플레이어는 모두 false를 디폴트로 가지고 있음
        ArrayList<Boolean> player = new ArrayList<Boolean>(playerNum);
        for (int i=0; i < playerNum ; i++) {
            player.add(false);
//         System.out.println(player.get(i));
        }
        //그 중 진실을 아는 사람 번호리스트는 트루
        for (int i=0; i < known; i++){
            player.set(knownId.get(i)-1, true);
        }
//        System.out.println("파티시작 전 :"+player.toString());
        ArrayList<ArrayList<Integer>> partyList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < partyNum; i++) {
            int partyPlayerNum = scanner.nextInt();
//            if (partyPlayerNum == 0){
//                zeroparty++;
//            }

            ArrayList<Integer> partyListList = new ArrayList<Integer>();
            for (int j = 0; j < partyPlayerNum; j++) {
                partyListList.add(scanner.nextInt());
            }

            for(int j=0; j<partyListList.size(); j++) {
                if(player.get(partyListList.get(j)-1) == true){
                    for(int k=0; k<partyListList.size(); k++) {
                        player.set(partyListList.get(k)-1, true);
                    }
                }
            }
            partyList.add(partyListList);
        }
        int cnt = 0;
        for (int i = 0; i < partyList.size(); i++) {
            for (int j = 0; j < partyList.get(i).size(); j++) {
                if(player.get(partyList.get(i).get(j)-1) == true){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(partyList.toString());
        System.out.println("파티시작 한바퀴 후 :"+player.toString());
        System.out.println(partyNum-cnt);
    }
}