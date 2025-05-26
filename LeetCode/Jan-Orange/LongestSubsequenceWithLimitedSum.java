package LeetCodeJanOrange;

public class LongestSubsequenceWithLimitedSum {
//    You are given an integer array nums of length n, and an integer array queries of length m.
//
//    Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].
//
//    A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
//
//
//
//    Example 1:
//
//    Input: nums = [4,5,2,1], queries = [3,10,21]
//    Output: [2,3,4]
//    Explanation: We answer the queries as follows:
//            - The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
//            - The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
//            - The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
//    Example 2:
//
//    Input: nums = [2,3,4,5], queries = [1]
//    Output: [0]
//    Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.
public static void main(String[] args) {
//    int[] nums = {469781,45635,628818,324948,343772,713803,452081};
//    int[] queries = {816646,929491};
    int[] nums = {4,5,2,1};
    int[] queries = {3,10,21};
    int[] ans = answerQueries(nums, queries);
    for(int a : ans){
        System.out.println(a);
    }
}

    private static int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int numsOfQue = 0;
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<=queries[i]){
                    if(j+1<nums.length){
                        if(nums[j]>nums[j+1]) {
                            continue;
                        }else{
                            numsOfQue+=nums[j];
                            if(numsOfQue<=queries[i]){
                                count++;
                            }else{
                                numsOfQue-=nums[j];
                            }
                        }
                    }


                }
            }
            result[i] = count;
        }
        return result;
    }
}
