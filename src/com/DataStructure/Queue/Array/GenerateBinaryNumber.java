package com.DataStructure.Queue.Array;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateBinaryNumber {

	public static void main(String[] args) {
		int n = 15;
		generate(n);
	}
		
	public static void generate(int n)
	{

		Queue<String> q = new ArrayDeque<>();
		q.add("1");

		int i = 1;
		while (i++ <= n)
		{
			q.add(q.peek() + "0");
			q.add(q.peek() + "1");

			System.out.print(q.poll() + ' ');
		}
	}

}
