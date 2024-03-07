package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// https://www.acmicpc.net/problem/1063
public class King {

	// private static final String[] chases = {"R", "L", "T", "B", "RT", "LT", "RB", "LB"};
	// private static final int[][] nums = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
	//
	// private static final String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H"};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// R, L, T, B, RT, LT, RB, LB
		// Map<String, int[]> cmdMap = new HashMap<>();
		// cmdMap.put("R", new int[] {0, 1});
		// cmdMap.put("L", new int[] {0, -1});
		// cmdMap.put("T", new int[] {1, 0});
		// cmdMap.put("B", new int[] {-1, 0});
		// cmdMap.put("RT", new int[] {1, 1});
		// cmdMap.put("LT", new int[] {1, -1});
		// cmdMap.put("RB", new int[] {-1, 1});
		// cmdMap.put("LB", new int[] {-1, -1});

		Map<String, int[]> cmdMap = Map.of(
			"R", new int[] {0, 1},
			"L", new int[] {0, -1},
			"T", new int[] {1, 0},
			"B", new int[] {-1, 0},
			"RT", new int[] {1, 1},
			"LT", new int[] {1, -1},
			"RB", new int[] {-1, 1},
			"LB", new int[] {-1, -1});

		// Map<String, Integer> alphabetMap = new HashMap<>();
		// alphabetMap.put("A", 1);
		// alphabetMap.put("B", 2);
		// alphabetMap.put("C", 3);
		// alphabetMap.put("D", 4);
		// alphabetMap.put("E", 5);
		// alphabetMap.put("F", 6);
		// alphabetMap.put("G", 7);
		// alphabetMap.put("H", 8);
		Map<String, Integer> alphabetMap = Map.of(
			"A", 1,
			"B", 2,
			"C", 3,
			"D", 4,
			"E", 5,
			"F", 6,
			"G", 7,
			"H", 8);

		String[] split = br.readLine().split(" ");

		String[] kingLocationStr = split[0].split("");
		int kingColumn = alphabetMap.get(kingLocationStr[0]);
		int kingRow = Integer.parseInt(kingLocationStr[1]);
		int[] kingLocation = {kingRow, kingColumn};

		String[] stoneLocationStr = split[1].split("");
		int stoneColumn = alphabetMap.get(stoneLocationStr[0]);
		int stoneRow = Integer.parseInt(stoneLocationStr[1]);
		int[] stoneLocation = {stoneRow, stoneColumn};

		int N = Integer.parseInt(split[2]);

		for (int i = 0; i < N; i++) {

			String cmd = br.readLine();
			int[] cmdLocation = cmdMap.get(cmd);

			// king이 체스판 밖으로 벗어나는 경우 continue
			if ((kingLocation[0] + cmdLocation[0]) < 1
				|| (kingLocation[0] + cmdLocation[0]) > 8
				|| (kingLocation[1] + cmdLocation[1]) < 1
				|| (kingLocation[1] + cmdLocation[1]) > 8) {
				continue;
			}

			// king에 현재 cmd 더하기
			kingLocation[0] += cmdLocation[0];
			kingLocation[1] += cmdLocation[1];

			// 돌과 같은 경우 돌도 이동
			if (kingLocation[0] == stoneLocation[0]
				&& kingLocation[1] == stoneLocation[1]) {
				// stone이 체스판 밖으로 벗어나는 경우 continue
				if ((stoneLocation[0] + cmdLocation[0]) < 1
					|| (stoneLocation[0] + cmdLocation[0]) > 8
					|| (stoneLocation[1] + cmdLocation[1]) < 1
					|| (stoneLocation[1] + cmdLocation[1]) > 8) {
					kingLocation[0] -= cmdLocation[0];
					kingLocation[1] -= cmdLocation[1];
					continue;
				}
				stoneLocation[0] += cmdLocation[0];
				stoneLocation[1] += cmdLocation[1];
			}

		}

		System.out.println((char)(kingLocation[1] + 'A' - 1) + "" + kingLocation[0]);
		System.out.println((char)(stoneLocation[1] + 'A' - 1) + "" + stoneLocation[0]);

	}

}
