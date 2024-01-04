// https://www.acmicpc.net/problem/11286

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AbsoluteHeap {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> {
			if(Math.abs(o1)== Math.abs(o2)){
				return o1-o2;
			}
			return Math.abs(o1)- Math.abs(o2);
		}));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int newNum = Integer.parseInt(br.readLine());

			if(newNum!=0){
				pq.add(newNum);
			}else {
				if (pq.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(pq.poll()).append('\n');
				}
			}
		}

		System.out.println(sb);

	}
}
