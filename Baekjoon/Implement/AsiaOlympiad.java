package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 25-06-04
// https://www.acmicpc.net/problem/2535
// 참고: https://kingle1024.tistory.com/m/542
public class AsiaOlympiad {

	// 2535
	public static void main(String[] args) throws IOException {
		process();
	}

	private static void process() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<People> priorityQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.score, o1.score));

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int country = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			priorityQueue.add(new People(country, num, score));
		}

		Map<Integer, Integer> countryMap = new HashMap<>();
		int resultCnt = 0;
		while (true) {
			People people = priorityQueue.poll();
			Integer countryCnt = countryMap.getOrDefault(people.country, 0);
			if (countryCnt != 2) {
				countryMap.put(people.country, countryCnt + 1);
				bw.write(people.country + " " + people.num + "\n");
				resultCnt++;
			}

			if (resultCnt == 3) {
				break;
			}
		}

		bw.flush();
		bw.close();
	}

	static class People {
		int country;
		int num;
		int score;

		public People(int country, int num, int score) {
			this.country = country;
			this.num = num;
			this.score = score;
		}
	}
}
