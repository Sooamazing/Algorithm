package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 24-10-08 15min
// https://www.acmicpc.net/problem/1269
public class SymmetricDifferenceSet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int aNum = Integer.parseInt(st.nextToken());
		int bNum = Integer.parseInt(st.nextToken());

		Set<Integer> aSet = new HashSet<>();
		Set<Integer> aSetRep = new HashSet<>();
		Set<Integer> bSet = new HashSet<>();

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < aNum; i++) {
			int a = Integer.parseInt(st.nextToken());
			aSet.add(a);
			aSetRep.add(a);
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < bNum; i++) {
			int b = Integer.parseInt(st.nextToken());
			bSet.add(b);
		}

		aSet.removeAll(bSet);
		bSet.removeAll(aSetRep);

		aNum = aSet.size();
		bNum = bSet.size();

		System.out.println(aNum + bNum);

	}
}
