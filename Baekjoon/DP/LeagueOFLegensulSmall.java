package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-18 30min
// https://www.acmicpc.net/problem/17271
public class LeagueOFLegensulSmall {
	static int totalTime;
	static int skillTime;
	static int[] skill;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		totalTime = Integer.parseInt(st.nextToken());
		skillTime = Integer.parseInt(st.nextToken());
		skill = new int[] {skillTime, 1};

		int[] skill = new int[totalTime + 1];
		skill[0] = 1;
		skill[1] = 1;

		for (int i = 2; i <= totalTime; i++) {
			skill[i] = skill[i - 1];
			if (i >= skillTime) {
				skill[i] = (skill[i] + skill[i - skillTime]) % 1_000_000_007;
			}
		}

		System.out.println(skill[totalTime]);
	}

	static int getAllCombis(int curTime) {
		int cnt = 0;

		if (totalTime < curTime) {
			return 0;
		}
		if (curTime == totalTime) {
			return 1;
		}

		cnt += getAllCombis(curTime + 1) % 1_000_000_007;
		cnt += getAllCombis(curTime + skill[1]) % 1_000_000_007;

		return cnt;
	}
}
