package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JewelryBox {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int childrenNum = Integer.parseInt(st.nextToken());
		int jewelryNum = Integer.parseInt(st.nextToken());

		int[] jewelries = new int[jewelryNum];
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < jewelryNum; i++) {
			jewelries[i] = Integer.parseInt(br.readLine());
			// pq.add(Integer.parseInt(br.readLine()));
		}

		// while (pq.size() < childrenNum) {
		// 	int poll = pq.poll();
		// 	pq.add(poll / 2);
		// 	pq.add(poll / 2 + poll % 2);
		// }
		//
		// System.out.println(pq.poll());

		Arrays.sort(jewelries);
		int idx = Arrays.binarySearch(jewelries, childrenNum);

		System.out.println(idx < 0 ? -(idx + 1) : idx);

	}
}
