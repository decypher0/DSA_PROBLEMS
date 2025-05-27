package WithAbhishek;

public class MinCostClimbingStrairs {
//    You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
//
//    You can either start from the step with index 0, or the step with index 1.
//
//    Return the minimum cost to reach the top of the floor.
//
//
//
//            Example 1:
//
//    Input: cost = [10,15,20]
//    Output: 15
//    Explanation: You will start at index 1.
//            - Pay 15 and climb two steps to reach the top.
//    The total cost is 15.
//    Example 2:
//
//    Input: cost = [1,100,1,1,1,100,1,1,100,1]
//    Output: 6
//    Explanation: You will start at index 0.
//            - Pay 1 and climb two steps to reach index 2.
//            - Pay 1 and climb two steps to reach index 4.
//            - Pay 1 and climb two steps to reach index 6.
//            - Pay 1 and climb one step to reach index 7.
//            - Pay 1 and climb two steps to reach index 9.
//            - Pay 1 and climb one step to reach the top.
//    The total cost is 6.
public static void main(String[] args) {
    int[] cost = {0,1,2,2};
    System.out.println(minCostClimbingStairs(cost));
}

//    static int recur(int idx, int[] cost) {
//        if(idx < 0) return Integer.MAX_VALUE / 4;
//        if(idx == 0) return cost[0];
//        if(idx == 1) return cost[1];
//        int curCost = 0;
//        if(idx != cost.length) {
//            curCost = cost[idx];
//        }
//        return curCost + Math.min(recur(idx - 1, cost, dp), recur(idx - 2, cost, dp));
//    }
    public static int minCostClimbingStairs(int[] cost) {
//        int minCostZero = 0;
//        int minCostOne = 0;
//        minCostZero+=cost[0];
//        minCostOne+=cost[1];
//        for(int i = 0; i<cost.length;){
//            int step1 = 0, step2 = 0;
//            if(i+1<cost.length){
//                step1=cost[i+1];
//            }
//            if(i+2<cost.length){
//                step2=cost[i+2];
//            }
//            if(step1>step2){
//                i=i+2;
//                minCostZero+=step2;
//            }else if(step1==step2){
//                if(step1==0 && step2==0){
//                    break;
//                }else{
//                    i=i+2;
//                    minCostZero+=step1;
//                }
//            }else{
//                i=i+1;
//                minCostZero+=step1;
//            }
//        }
//        for(int i = 1; i<cost.length;){
//            int step1 = 0, step2 = 0;
//            if(i+1<cost.length){
//                step1=cost[i+1];
//            }
//            if(i+2<cost.length){
//                step2=cost[i+2];
//            }
//            if(step1>step2){
//                i=i+2;
//                minCostOne+=step2;
//            }else if(step1==step2){
//                i=i+2;
//                minCostOne+=step1;
//            }else{
//                i=i+1;
//                minCostOne+=step1;
//            }
//        }
//        int minCost = 0;
//        if(minCostZero<minCostOne)
//            minCost=minCostZero;
//        else
//            minCost=minCostOne;
//
//        return minCost;
//        return recur(cost.length, cost);
        return 0;
    }
}
