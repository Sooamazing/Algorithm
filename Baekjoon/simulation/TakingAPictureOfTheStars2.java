
import java.util.*;
import java.lang.*;
import java.io.*;


// 24-11-14 5min
// https://www.acmicpc.net/problem/2439
class TakingAPictureOfTheStars2
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();

int num = Integer.parseInt(br.readLine());

for(int i=0;i<num;i++){
sb.append(" ".repeat(num-i-1)).append("*".repeat(i+1)).append("\n");
}


System.out.println(sb);
	}
}
