package boj;

import java.util.*;


public class Boj1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //사람의 수
        int playerNum = scanner.nextInt();
        //파티의 수
        int partyNum = scanner.nextInt();
        //진실을 아는사람 수
        int knownCount = scanner.nextInt();
        //진실을 아는사람 번호 리스트
        List<Integer> knownIdList = new ArrayList<>(knownCount);
        for (int i = 0; i < knownCount; i++) {
            int knownId = scanner.nextInt();
            knownIdList.add(knownId);
        }

        List<List<Integer>> totalPartyPeopleIdList = new ArrayList<>();
        for (int i = 0; i < partyNum; i++) {
            int aPartyPeopleCount = scanner.nextInt();
            List<Integer> aPartyPeopleIdList = new ArrayList<>();
            for (int j = 0; j < aPartyPeopleCount; j++) {
                int aPartyPeopleId = scanner.nextInt();
                aPartyPeopleIdList.add(aPartyPeopleId);
            }
            totalPartyPeopleIdList.add(aPartyPeopleIdList);
        }
        Set<Integer> totalKnownPeopleIdSet = new HashSet<>();
        for (int k = 0; k < totalPartyPeopleIdList.size(); k++) {
            for (int i = 0; i < totalPartyPeopleIdList.size(); i++) {
                for (int j = 0; j < knownIdList.size(); j++) {
                    boolean result = totalPartyPeopleIdList.get(i).contains(knownIdList.get(j));
                    if (result) {
                        totalKnownPeopleIdSet.addAll(totalPartyPeopleIdList.get(i));
                        break;
                    }
                }
            }
            ArrayList<Integer> list = new ArrayList<>(totalKnownPeopleIdSet);
            knownIdList.addAll(list);
        }
        int count = 0;
        ArrayList<Integer> resultList = new ArrayList<>(totalKnownPeopleIdSet);
        for (int i = 0; i < totalPartyPeopleIdList.size(); i++) {
            for (int j = 0; j < resultList.size(); j++) {
                if (totalPartyPeopleIdList.get(i).contains(resultList.get(j))) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(partyNum - count);
    }
}