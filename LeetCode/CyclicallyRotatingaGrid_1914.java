package LeetCode;

// 26-07-14 120min
// https://leetcode.com/problems/cyclically-rotating-a-grid
public class CyclicallyRotatingaGrid_1914 {

    public int[][] rotateGrid(int[][] grid, int k) {

        int row = grid.length;
        int col = grid[0].length;
        int[][] answers = new int[row][col];

        int maxLayer = Math.min(row, col) / 2;

        int currentRow = row;
        int currentCol = col;
        for (int layer = 0; layer < maxLayer; layer++) {
            // System.out.println("-------");
            int total = (currentRow + currentCol) * 2 - 4;
            // 총 개수
            int startK = k % total;
            int startR = 0;
            int startC = 0;
            if (startK < currentCol) {
                startR = 0;
                startC = startK + 0;
                // System.out.println(1);
            } else if (startK < (currentCol + currentRow - 1)) {
                startR = (startK - currentCol + 1) + 0;
                startC = currentCol - 1;
                // System.out.println(2);
            } else if (startK < (currentCol * 2 + currentRow - 3)) {
                startR = currentRow - 1;
                startC = (currentCol * 2 + currentRow - 3) - startK;
                // System.out.println(3);
            } else {
                startR = (total - startK) + 0;
                startC = 0;
                // System.out.println(4);
            }
            // System.out.println(total+", "+startK+", "+startR+", "+startC+", "+currentRow+", "+currentCol);
            // answers에 집어 넣기
            dfs(answers, grid, startR, startC, currentRow - 1, currentCol - 1, layer);

            currentRow -= 2;
            currentCol -= 2;
            // 각 레이어의 start는 (layer, layer), 4분면 각각 +-layer
        }

        return answers;
    }

    private void dfs(int[][] answers, int[][] grid, int startR, int startC, int row, int col,
            int layer) {

        int currentR = startR + layer;
        int currentC = startC + layer;

        int answerR = layer;
        int answerC = layer;
        while (true) {

            int currentValue = grid[currentR][currentC];
            // System.out.println(currentR + ", " + currentC + ", " + currentValue + ", " + row + ", " + col + ", " + layer);
            if (currentValue == -1) {
                break;
            }
            answers[answerR][answerC] = currentValue;
            grid[currentR][currentC] = -1;

            if ((currentC == layer) && (currentR != layer)) {
                // 위로 가기
                currentR--;
                // System.out.println("up");
            } else if (currentR == (layer + row)) {
                // 왼쪽으로 가기
                currentC--;
                // System.out.println("left");
            } else if (currentC == (layer + col)) {
                // 아래로 가기
                currentR++;
                // System.out.println("down");
            } else if (currentR == layer) {
                // 오른쪽으로 가기
                currentC++;
                // System.out.println("right");
            }

            if ((answerC == layer) && (answerR != layer)) {
                // 위로 가기
                answerR--;
            } else if (answerR == (layer + row)) {
                // 왼쪽으로 가기
                answerC--;
            } else if (answerC == (layer + col)) {
                // 아래로 가기
                answerR++;
            } else if (answerR == layer) {
                // 오른쪽으로 가기
                answerC++;
            }
        }

    }
}