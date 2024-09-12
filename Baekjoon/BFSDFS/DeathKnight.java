package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DeathKnight {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int chessSize = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] start = new int[2];
		int[] end = new int[2];
		start[0] = Integer.parseInt(st.nextToken());
		start[1] = Integer.parseInt(st.nextToken());
		end[0] = Integer.parseInt(st.nextToken());
		end[1] = Integer.parseInt(st.nextToken());

		char[][] chess = new char[chessSize][chessSize];
	}
}
