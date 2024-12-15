import java.util.*;

import java.lang.*;

import java.io.*;

// 24-12-06 5min
// https://www.acmicpc.net/problem/2420
class SafariWorld

{

	public static void main (String[] args) throws IOException	{

		// your code goes here

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer(br.readLine());

long a = Long.parseLong(st.nextToken());

long b = Long.parseLong(st.nextToken());

long result = Math.abs(a-b);

System.out.println(result);

	}

}
