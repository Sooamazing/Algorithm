

import java.util.*;
import java.lang.*;
import java.io.*;

// 24-12-18 5min
// https://www.acmicpc.net/problem/5543
class SangeunNald
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int burgerMin= Integer.parseInt(br.readLine());
burgerMin= Math.min(burgerMin, Integer.parseInt(br.readLine()));
burgerMin= Math.min(burgerMin, Integer.parseInt(br.readLine()));

int ciderMin= Integer.parseInt(br.readLine());
ciderMin= Math.min(ciderMin, Integer.parseInt(br.readLine()));

System.out.println(burgerMin+ciderMin-50);
	}
}
