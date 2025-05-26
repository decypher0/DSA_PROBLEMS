import java.util.*;

class Solution {
    private List<Integer>[] reverseGraph;

    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        reverseGraph = new List[n];
        for (int i = 0; i < n; i++) {
            reverseGraph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int j = favorite[i];
            reverseGraph[j].add(i);
        }

        List<int[]> mutualPairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = favorite[i];
            if (i < j && favorite[j] == i) {
                mutualPairs.add(new int[]{i, j});
            }
        }

        int sumPairs = 0;
        for (int[] pair : mutualPairs) {
            int a = pair[0];
            int b = pair[1];
            int aDepth = computeMaxDepth(a, b);
            int bDepth = computeMaxDepth(b, a);
            sumPairs += 2 + aDepth + bDepth;
        }

        int maxCycle = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int cycleLength = findCycleLength(i, favorite, visited);
                if (cycleLength > 2) {
                    maxCycle = Math.max(maxCycle, cycleLength);
                }
            }
        }
        return Math.max(sumPairs, maxCycle);
    }

    private int computeMaxDepth(int node, int exclude) {
        if (node == exclude) {
            return 0;
        }
        int maxDepth = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            maxDepth++;
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                for (int neighbor : reverseGraph[current]) {
                    if (neighbor != exclude) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
        return maxDepth - 1;
    }

    private int findCycleLength(int node, int[] favorite, boolean[] visited) {
        int slow = node;
        int fast = node;
        do {
            slow = favorite[slow];
            fast = favorite[favorite[fast]];
        } while (slow != fast);

        int len = 0;
        do {
            slow = favorite[slow];
            len++;
            visited[slow] = true;
        } while (slow != fast);

        return len;
    }
}