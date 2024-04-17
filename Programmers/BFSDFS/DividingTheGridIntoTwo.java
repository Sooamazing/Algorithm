package Programmers.BFSDFS;

// 24-04-17 40min
// https://school.programmers.co.kr/learn/courses/30/lessons/86971
public class DividingTheGridIntoTwo {

	boolean[] visitedPlace;
	boolean[][] visitedNode;
	int temp;

	public int solution(int n, int[][] wires) {
		int min = 101;

		int length = wires.length;
		for (int i = 0; i < length; i++) {
			visitedPlace = new boolean[n + 1];
			visitedNode = new boolean[n + 1][n + 1];
			for (int j = 0; j < length; j++) {
				if (i != j) {
					int[] curNode = wires[j];
					int x = curNode[0];
					int y = curNode[1];
					visitedNode[x][y] = visitedNode[y][x] = true;
				}
			}

			temp = 0;
			visitedPlace[1] = true;
			getAnswer(n, 1);
			int differ = Math.abs(n - temp - temp);
			// System.out.println("i번째: "+i+", temp: "+temp+", differ: "+differ);
			min = Math.min(min, differ);

		}

		return min;
	}

	void getAnswer(int n, int curIdx) {
		// System.out.println("[IN] curIdx: "+curIdx+", temp: "+temp);
		temp++;

		for (int i = 1; i <= n; i++) {
			if (!visitedPlace[i] && (visitedNode[curIdx][i] || visitedNode[i][curIdx])) {

				// System.out.println("curIdx: "+curIdx+", temp: "+temp);
				visitedPlace[i] = true;
				getAnswer(n, i);
			}
		}
	}
}
