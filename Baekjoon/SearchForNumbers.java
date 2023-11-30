// https://www.acmicpc.net/problem/1920

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SearchForNumbers {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		// int[] arrA = new int[N];
		// List<Integer> list = new ArrayList<>();
		// PriorityQueue<Integer> pqA = new PriorityQueue();
		Map<Integer, Integer> map = new HashMap<>();
		String[] split = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			// list.add(Integer.parseInt(split[i]));
			// pqA.add(Integer.parseInt(split[i]));
			// arrA[i] = Integer.parseInt(split[i]);
			map.put(Integer.parseInt(split[i]),1);
		}

		int M = Integer.parseInt(br.readLine());
		split = br.readLine().split(" ");
		for (int i = 0; i < split.length; i++) {
			// Integer temp = pqA.poll();
			// int temp = Integer.parseInt(split[i]);
			if(map.containsKey(Integer.parseInt(split[i]))){
				sb.append('1').append('\n');
			}else{
				sb.append('0').append('\n');
			}
		}

		System.out.println(sb);
	}
}
