package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-06-06 150min
// https://www.acmicpc.net/problem/1325
// 참고: https://ggyuing.tistory.com/50
public class EfficientHacking {
	static List<Integer>[] computers;
	// static PriorityQueue<int[]> result;
	// static int[] tResult;
	static boolean[] visit;
	// static int[] dp; // cycle 때문에 안 됨?

	static int computerNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		computerNum = Integer.parseInt(st.nextToken());
		int hackingNum = Integer.parseInt(st.nextToken());

		computers = new List[computerNum + 1];
		visit = new boolean[computerNum + 1];
		// tResult = new int[computerNum + 1];
		// dp = new int[computerNum + 1];
		// Arrays.fill(dp, 1);
		for (int i = 0; i <= computerNum; i++) {
			computers[i] = new ArrayList<>();
		}
		for (int i = 0; i < hackingNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			computers[a].add(b);
			// computers[b].add(a); // 왜 이러면 안 되지?
		}

		result = new int[computerNum + 1];
		// result = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
		for (int i = 1; i <= computerNum; i++) {
			visit = new boolean[computerNum + 1];
			Queue<Integer> que = new LinkedList<>();
			que.add(i);
			visit[i] = true;

			while (!que.isEmpty()) {
				int poll = que.poll();
				// List<Integer> list = computers[poll];
				for (int temp : computers[poll]) {
					if (!visit[temp]) {
						visit[temp] = true;
						result[temp]++;
						// max = Math.max(result[temp], max);
						que.add(temp);
					}
				}
			}
			// if (!computers[i].isEmpty()) {
			// calc(i);
			// result.add(new int[] {i, curSum});
			// max = Math.max(max, curSum);
			// }
		}
		// Collections.sort(result, (o1, o2) -> o2[1] - o1[1]);

		StringBuilder sb = new StringBuilder();
		// if (max == 0) {
		// 	return;
		// }
		for (int v : result) {
			max = Math.max(max, v);
		}
		for (int i = 1; i <= computerNum; i++) {
			if (result[i] == max)
				sb.append(i).append(" ");
		}
		// for (int i = 0; i < result.size(); i++) {
		// 	if (result.peek()[1] == max) {
		// 		sb.append(result.poll()[0]).append(" ");
		// 	} else {
		// 		break;
		// 	}
		// }
		System.out.print(sb);

		// PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]); // computer, size
		// for (int i = 1; i <= computerNum; i++) {
		// 	pq.add(new int[] {i, computers[i].size()});
		// }

		// StringBuilder sb = new StringBuilder();
		// int[] poll = pq.poll();
		// sb.append(poll[0]).append("\n");
		//
		// while (!pq.isEmpty() && poll[1] == pq.peek()[1]) {
		// 	poll = pq.poll();
		// 	sb.append(poll[0]).append("\n");
		// }
		//
		// System.out.println(sb);

	}

	static int max;
	static int[] result;

	// bfs
	static void calc(int curCom) {

		Queue<Integer> que = new LinkedList<>();

		que.add(curCom);
		visit[curCom] = true;

		while (!que.isEmpty()) {
			int poll = que.poll();
			// List<Integer> list = computers[poll];
			for (int temp : computers[poll]) {
				if (!visit[temp]) {
					visit[temp] = true;
					result[temp]++;
					// max = Math.max(result[temp], max);
					que.add(temp);
				}
			}
		}

	}

	// dfs
	// static int calc(int curCom) {
	//
	// 	visit[curCom] = true;
	// 	List<Integer> tempComs = computers[curCom];
	//
	// 	int sum = 1;
	// 	for (int i = 0; i < tempComs.size(); i++) {
	// 		int tempCom = tempComs.get(i);
	// 		if (!visit[tempCom]) {
	// 			sum += calc(tempCom);
	// 			visit[tempCom] = false;
	// 		}
	// 	}
	//
	// 	return sum;
	//
	// }

}
