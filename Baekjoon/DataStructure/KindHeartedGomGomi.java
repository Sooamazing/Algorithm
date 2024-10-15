package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 24-10-15 10min
// https://www.acmicpc.net/problem/25192
public class KindHeartedGomGomi {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int gomgomi = 0;
		Set<String> peopleSet = new HashSet<>();
		while (num-- > 0) {
			String msg = br.readLine();
			if (msg.equals("ENTER")) {
				gomgomi += peopleSet.size();
				peopleSet = new HashSet<>();
				continue;
			}
			peopleSet.add(msg);
		}

		gomgomi += peopleSet.size(); // 마지막 곰곰이 인사 더하기
		System.out.println(gomgomi);
	}
}
