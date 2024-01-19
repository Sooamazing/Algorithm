package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Good {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Map<Integer, Integer> map = new TreeMap<>();
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int result = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			int target = arr[i];
			int left = 0;
			int right = N - 1;
			while (left < right) {
				if (left == i) {
					left++;
					continue;
				} else if (right == i) {
					right--;
					continue;
				}
				int sum = arr[left] + arr[right];
				if (target < sum) {
					right--;
				} else if (target > sum) {
					left++;
				} else {
					result++;
					break;
				}
			}
		}

		// for (int i = 0; i < s.length; i++) {
		// 	int num = Integer.parseInt(s[i]);
		// 	map.compute(num, (k, v) -> v == null ? 1 : v + 1);
		// }

		// List<Integer> list = map.keySet().stream().collect(Collectors.toList());
		// long result = 0;
		// for (int i = 0; i < list.size(); i++) {
		// 	int num = list.get(i);
		// 	for (int j = i + 1; j < list.size(); j++) {
		// 		int num2 = list.get(j);
		// 		int sum = num + num2;
		// 		long value = (long)map.get(num);
		// 		long value2 = (long)map.get(num2);
		//
		// 		if (map.containsKey(sum)) {
		// 			result += (long)map.get(sum) * value * value2;
		// 			map.remove(sum);
		// 		}
		// 	}
		// }
		System.out.println(result);
	}
}
