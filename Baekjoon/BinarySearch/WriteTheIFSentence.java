// https://www.acmicpc.net/problem/19637

package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteTheIFSentence {

	public static void main(String[] args) throws IOException {
		// 1 ≤ N ≤ 10^5
		// 1 ≤ M ≤ 10^5
		// 1 ≤ N, M ≤ 10^5
		// 각 칭호의 이름을 나타내는 길이 1 이상, 11 이하의 영어 대문자로만 구성된 문자열과 해당 칭호의 전투력 상한값을 나타내는 10^9 이하의 음이 아닌 정수
		// 칭호는 전투력 상한값의 비내림차순으로 주어진다. (오름차순인데, 같을 수도 있다는 의미)
		// 해당하는 칭호가 없는 전투력은 입력으로 주어지지 않는다.
		// 어떤 캐릭터의 전투력으로 출력할 수 있는 칭호가 여러 개인 경우 가장 먼저 입력된 칭호 하나만 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] split = br.readLine().split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);

		List<Integer> list_value = new ArrayList<>();
		List<String> list_key = new ArrayList<>();

		int prevV = -1;
		// int idxCnt = 0;
		for (int i = 0; i < N; i++) {
			split = br.readLine().split(" ");
			int curV = Integer.parseInt(split[1]);
			if (prevV == curV) {
				continue;
			}
			list_key.add(split[0]);
			list_value.add(curV);
			// arr_key[idxCnt] = split[0];
			// arr_value[idxCnt] = curV;
			prevV = curV;
			// idxCnt++;
		}
		int[] arr_value = new int[list_value.size()];
		String[] arr_key = new String[list_key.size()];

		for (int i = 0; i < list_key.size(); i++) {
			arr_key[i]=list_key.get(i);
			arr_value[i]=list_value.get(i);
		}

		for (int i = 0; i < M; i++) {
			int temp = Integer.parseInt(br.readLine());
			int keyIdx = Arrays.binarySearch(arr_value, temp);
			if (keyIdx < 0) {
				keyIdx = (keyIdx + 1) * (-1);
			}

			sb.append(arr_key[keyIdx]).append('\n');

		}
		System.out.println(sb);

	}

}
