import java.util.*;

import java.lang.*;

import java.io.*;

// 24-12-04 5min
// https://www.acmicpc.net/problem/10039
class AverageScore.

{

	public static void main (String[] args) throws java.lang.Exception	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int sum = 0;

for(int i=0;i<5;i++){

int num = Integer.parseInt(br.readLine());

if(num<40){

sum+=40;

continue;

}

sum+=num;

}

System.out.println(sum/5);

	}

}
