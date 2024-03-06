package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/14888
public class InsertOperator {

	private static final String PLUS = "+";
	private static final String MINUS = "-";
	private static final String MULTIPLE = "*";
	private static final String DIVIDE = "/";

	private static int N;
	private static long max, min;
	private static int[] numbers;
	private static List<String> operators;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		numbers = new int[N];
		int[] operator = new int[4];
		operators = new ArrayList<>();
		visited = new boolean[N];

		String[] split = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}

		split = br.readLine().split(" ");
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(split[i]);
		}

		for (int i = 0; i < 4; i++) {
			int operatorNum = operator[i];
			for (int j = 0; j < operatorNum; j++) {
				switch (i) {
					case 0:
						operators.add(PLUS);
						break;
					case 1:
						operators.add(MINUS);
						break;
					case 2:
						operators.add(MULTIPLE);
						break;
					case 3:
						operators.add(DIVIDE);
						break;
					default:
						break;
				}
			}
		}

		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		getSum(0, numbers[0]);
		System.out.println(max);
		System.out.println(min);

	}

	private static void getSum(int depth, int sum) {
		if (depth == N - 1) {
			// System.out.println(depth);
			// System.out.println(sum);
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}

		for (int i = 0; i < N - 1; i++) {
			int curNum = numbers[depth + 1];
			if (visited[i]) {
				continue;
			}
			String curOp = operators.get(i);
			visited[i] = true;
			switch (curOp) {
				case PLUS:
					getSum(depth + 1, sum + curNum);
					visited[i] = false;
					break;
				case MINUS:
					getSum(depth + 1, sum - curNum);
					visited[i] = false;
					break;
				case MULTIPLE:
					getSum(depth + 1, sum * curNum);
					visited[i] = false;
					break;
				case DIVIDE:
					getSum(depth + 1, sum / curNum);
					visited[i] = false;
					break;
				default:
					break;
			}
		}

	}

}
