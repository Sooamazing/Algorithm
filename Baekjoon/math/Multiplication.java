import java.util.*;

import java.lang.*;

import java.io.*;

class Main

{

	public static void main (String[] args) throws IOException	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringBuilder sb = new StringBuilder();

String first = br.readLine();

String second = br.readLine();

int firstNum = Integer.parseInt(first);

int secondNum = Integer.parseInt(second);

for(int i=2;i>=0;i--){

int multipleNum = second.charAt(i)-'0';

sb.append(firstNum*multipleNum).append("\n");

}

sb.append(firstNum*secondNum);

System.out.println(sb);

	}

}
