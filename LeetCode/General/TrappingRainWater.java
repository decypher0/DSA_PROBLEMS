import java.util.PriorityQueue;

public class TrappingRainWater {
        private final int[][] directions = new int[][] {
                {-1, 0}, {0, -1}, {0, 1}, {1, 0}
        };

        private boolean isSafe(int x, int y, int rows, int cols) {
            return 0 <= x && x < rows && 0 <= y && y < cols;
        }

        public int trapRainWater(int[][] heightMap) {
            int totalVolume = 0;
            int rows = heightMap.length;
            int cols = heightMap[0].length;
            boolean[][] visited = new boolean[rows][cols];
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
            for (int i = 0; i < cols; i++) {
                // along the first row
                visited[0][i] = true;
                pq.offer(new int[] {0, i, heightMap[0][i]});

                // along the last row
                visited[rows - 1][i] = true;
                pq.offer(new int[] {rows - 1, i, heightMap[rows - 1][i]});
            }

            // getting along the column boundaries
            for (int i = 0; i < rows; i++) {
                // along the first col
                visited[i][0] = true;
                pq.offer(new int[] {i, 0, heightMap[i][0]});

                // along the last col
                visited[i][cols - 1] = true;
                pq.offer(new int[] {i, cols - 1, heightMap[i][cols - 1]});
            }
            while (!pq.isEmpty()) {
                int[] currentSmallest = pq.poll();
                int currentX = currentSmallest[0];
                int currentY = currentSmallest[1];
                int currentHeight = currentSmallest[2];

                for (int[] direction : directions) {
                    int neighbourX = currentX + direction[0];
                    int neighbourY = currentY + direction[1];

                    if (isSafe(neighbourX, neighbourY, rows, cols) && !visited[neighbourX][neighbourY]) {
                        int neighbourHeight = heightMap[neighbourX][neighbourY];
                        visited[neighbourX][neighbourY] = true;

                        totalVolume += Math.max(0, currentHeight - neighbourHeight);

                        pq.offer(new int[] {neighbourX,  neighbourY,
                                Math.max(currentHeight, neighbourHeight)});

                    }
                }
            }
            return totalVolume;
        }
}
