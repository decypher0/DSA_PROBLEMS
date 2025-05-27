package WithAbhishek;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
//    You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//    Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
//
//
//
//            Example 1:
//
//    Input: nums = [1,2,3,1]
//    Output: 4
//    Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//    Total amount you can rob = 1 + 3 = 4.
//    Example 2:
//
//    Input: nums = [2,7,9,3,1]
//    Output: 12
//    Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//    Total amount you can rob = 2 + 9 + 1 = 12.
    public static void main(String[] args){
        int nums[] = {2,1,1, 2};
//        long money = rob(nums);
        System.out.print(rob(nums));
    }

//    private static long robMoney(int[] nums) {
//        int maxSum1 = 0;
//        for(int i=0;i<nums.length;i=i+2){
//            maxSum1+=nums[i];
//        }
//        int maxSum2 = 0;
//        for(int i = 1;i<nums.length;i=i+2){
//            maxSum2+=nums[i];
//        }
//        int resultSum = 0;
//        if(maxSum2>maxSum1)
//            resultSum = maxSum2;
//        else
//            resultSum=maxSum1;
//        return resultSum;
//    }

//    private static long robMoney(int[] nums){
//        int maxMoney = nums[0];
//        int maxIndex = 0;
//        for(int i=1;i<nums.length;i++){
//            if(maxMoney < nums[i]) {
//                maxMoney = nums[i];
//                maxIndex = i;
//            }
//        }
//        int maxTotal = maxMoney;
//        int runningIndex = maxIndex;
//        for(int i=0;i<nums.length;i++){
//            if(maxIndex != 0){
//                if(i!=(maxIndex+1) && i!=(maxIndex-1) && i!= maxIndex && i!=(runningIndex+1)){
//                    maxTotal+=nums[i];
//                    runningIndex = i;
//                }
//            }else{
//                if(i!=(maxIndex+1) && i!= maxIndex && i!=(runningIndex+1)){
//                    maxTotal+=nums[i];
//                    runningIndex = i;
//                }
//            }
//        }
//        return maxTotal;
//    }

//    class Solution {
//        map<int, int> dp;
//        public:
//        int rob(vector<int>& nums) {
//            int fp = 0, sp = 1;
//
//            return recurse(nums, 0);
//        }
//
//        int recurse(vector<int>& nums, int idx) {
//            if (dp.find(idx) != dp.end()) return dp[idx];
//            if (idx > nums.size() - 1) return 0;
//
//            int robbed = recurse(nums, idx + 2) + nums[idx];
//            int skipped = recurse(nums, idx + 1);
//
//            return dp[idx] = max(robbed, skipped);
//        }
//    };

    private static Map<Integer, Integer> dp = new HashMap<>();

    public static int rob(int[] nums) {
        return recurse(nums, 0);
    }
    private static int recurse(int[] nums, int idx) {
        if (dp.containsKey(idx)) {
            return dp.get(idx);
        }
        if (idx >= nums.length) {
            return 0;
        }

        // Rob this house and move two houses ahead, or skip this house
        int robbed = recurse(nums, idx + 2) + nums[idx];
        int skipped = recurse(nums, idx + 1);

        // Memoize the result
        dp.put(idx, Math.max(robbed, skipped));
        return dp.get(idx);
    }

}
