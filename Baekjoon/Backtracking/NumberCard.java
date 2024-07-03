package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-03 25min
// https://www.acmicpc.net/problem/2591
public class NumberCard {

	static int[] nums;
	static boolean[] visited;
	static int length;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		length = str.length();
		nums = new int[length];
		visited = new boolean[length];
		for (int i = 0; i < length; i++) {
			nums[i] = str.charAt(i) - '0';
		}

		int result = 0;
		// temp = new int[length];
		// Arrays.fill(temp, -1);
		result += dfs(0);

		System.out.println(result);
	}

	// static int[] temp;

	static int dfs(int curIdx) {

		int sum = 0;

		// 범위 넘어갈 때까지 도착했다면, +1
		if (curIdx >= length) {
			// for (int v : temp) {
			// 	System.out.print(v + " ");
			// }
			// System.out.println();
			return 1;
		}

		// 360은 0 출력
		// 한 자리를 더할 때는 0 이상.
		if (nums[curIdx] > 0) {
			// temp[curIdx] = nums[curIdx];
			sum += dfs(curIdx + 1);
		}

		// 0101에서 0으로 시작하면 안 됨.
		// 두 자리 더할 때도 첫 자리는 0 초과, 최종 34 이하
		if (curIdx + 1 < length && nums[curIdx] != 0
			&& nums[curIdx] * 10 + nums[curIdx + 1] <= 34) {
			// temp[curIdx] = nums[curIdx] * 10 + nums[curIdx + 1];
			sum += dfs(curIdx + 2);
		}

		return sum;

		// copilot - ... 내가 푼 것과 정확히 같군...
		// if (index == nums.length) {
		// 	return 1;
		// }
		//
		// int result = 0;
		// if (nums[index] != 0 && !visited[index]) {
		// 	visited[index] = true;
		// 	result += dfs(nums, visited, index + 1);
		// 	visited[index] = false;
		// }
		//
		// if (index + 1 < nums.length && nums[index] != 0 && nums[index] * 10 + nums[index + 1] <= 34 && !visited[index + 1]) {
		// 	visited[index + 1] = true;
		// 	result += dfs(nums, visited, index + 2);
		// 	visited[index + 1] = false;
		// }
		//
		// return result;
	}
}
