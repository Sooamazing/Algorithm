package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-11 25min
// https://www.acmicpc.net/problem/10157
public class PlaceAllocation {

    private static int[][] hall;

    private static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // down, right, up, left;

    private static int direction = 0;

    private static int row, col;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        hall = new int[row][col];

        int customer = Integer.parseInt(br.readLine());

        if (customer > row * col) {
            System.out.println(0);
            return;
        }

        int[] seat = getCustomerSeat(customer);

        System.out.println(seat[0] + " " + seat[1]);

    }

    // 둘 다 +1 필요.
    private static int[] getCustomerSeat(int order) {

        int r = 0;
        int c = 0;

        for (int i = 1; i <= order; i++) {

            hall[r][c] = i; // visited

            if (i == order) {
                return new int[]{c + 1, r + 1};
            }

            int nr = r + dir[direction][0];
            int nc = c + dir[direction][1];

            if (isOutOfRange(nr, nc) || hall[nr][nc] != 0) {
                direction = (direction + 1) % 4;
                nr = r + dir[direction][0];
                nc = c + dir[direction][1];
            }

            r = nr;
            c = nc;
        }

        return new int[]{-1};
    }

    private static boolean isOutOfRange(int r, int c) {

        return r < 0 || r >= row || c < 0 || c >= col;
    }
}