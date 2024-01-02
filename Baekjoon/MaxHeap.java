// https://www.acmicpc.net/problem/11279

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeap {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < N; i++) {
			int cur = Integer.parseInt(br.readLine());

			if(cur==0){
				if(pq.isEmpty()){
					sb.append(0).append('\n');
				}else{
					sb.append(pq.poll()).append('\n');
				}
			}else{
				pq.add(cur);
			}

		}

		System.out.println(sb);

	}
}
