package programmers.pgm43165;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    // int[] numbers = {4, 1, 2, 1}; target = 4
    private int dfs(int[] numbers, int n, int sum, int target) {
        String s = nTab(n);
        System.out.println(s+"===========dfs(numbers,"+n+","+sum+","+"4)===========");
        if(n == numbers.length){
            if(sum == target){
//                System.out.println("n : "+n+" sum : "+sum);
                System.out.println("+1");
                return 1;
            }
            System.out.println("+0");
            return 0;
        }

        int nPlusOne = n + 1;
        int sumPlusNumberN = sum + numbers[n];
        int sumMinusNumberN = sum - numbers[n];
        System.out.println(s+"dfs(numbers,"+ nPlusOne +","+sumPlusNumberN+","+"4) + dfs(numbers,"+ nPlusOne + ","+sumMinusNumberN+",4)");
        System.out.println(s+"========================================");
        return dfs(numbers, n+1, sum + numbers[n], target) + dfs(numbers, n+1, sum - numbers[n], target);
    }

    private String nTab (int n){
        StringBuilder stringBuilder = new StringBuilder();
        String tab = "  ";
        stringBuilder.append(tab.repeat(Math.max(0, n)));
        return stringBuilder.toString();
    }
}
