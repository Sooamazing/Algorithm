package Baekjoon.unionfind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 24-04-19 90min
// https://www.acmicpc.net/problem/1043
// 반례
// 8 4
// 1 1
// 3 1 2 3
// 3 4 5 6
// 3 6 7 8
// 2 3 8
public class YoureLying {
	static int[] people;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int peopleNum = Integer.parseInt(st.nextToken());
		int partyNum = Integer.parseInt(st.nextToken());
		List<int[]> partyList = new LinkedList<>();
		people = new int[peopleNum + 1];
		for (int i = 1; i <= peopleNum; i++) {
			people[i] = i;
		} // 부모 노드 초기화
		int curTruthPerson = 0;
		st = new StringTokenizer(br.readLine());
		int onlyTruthNum = Integer.parseInt(st.nextToken());
		int prevTruthPerson = 0;
		if (onlyTruthNum != 0) {
			prevTruthPerson = Integer.parseInt(st.nextToken());
		}
		while (st.hasMoreTokens()) {
			// truth person도 한 파티라고 생각하고, union 포함
			curTruthPerson = Integer.parseInt(st.nextToken());
			union(prevTruthPerson, curTruthPerson);
			prevTruthPerson = curTruthPerson;
		}

		for (int i = 0; i < partyNum; i++) {
			st = new StringTokenizer(br.readLine());
			int curPersonNum = Integer.parseInt(st.nextToken());
			int[] tempParty = new int[curPersonNum];
			int prevPerson = Integer.parseInt(st.nextToken());
			tempParty[0] = prevPerson;
			int idx = 1;
			while (st.hasMoreTokens()) {
				int curPerson = Integer.parseInt(st.nextToken());
				tempParty[idx++] = curPerson;
				union(prevPerson, curPerson);
				prevPerson = curPerson;
			}
			partyList.add(tempParty);
		}

		// curTruthPerson
		int truthNumResult = people[prevTruthPerson];
		int result = 0;
		for (int[] party : partyList) {
			boolean allTrue = false;
			for (int person : party) {
				if (people[person] == truthNumResult) {
					allTrue = true;
					break;
				}
			}
			if (!allTrue) {
				result++;
			}
			// if (Arrays.binarySearch(party, truthNumResult) <= 0) {
			// 	result++;
			// }
		}

		System.out.println(result);

	}

	private static boolean union(int x, int y) {
		// 부모 노드 찾기
		x = find(x);
		y = find(y);

		if (x == y)
			return false;
		if (x >= y)
			people[x] = y;
		else
			people[y] = x;
		return true;
	}

	private static int find(int cur) {
		if (people[cur] == cur)
			return cur;
		else
			// return people[cur] = find(people[cur]);
			return find(people[cur]);
	}
}

