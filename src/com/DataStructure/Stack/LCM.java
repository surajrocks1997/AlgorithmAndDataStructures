package com.DataStructure.Stack;
import java.util.Stack;
public class LCM {

	public static void main(String[] args) {
		
		int num1 = 16;
		int num2 = 49;
		
//		int x = 32/16 = 2
//		int y = 32%16 = 0 
		
		System.out.print("LCM: ");
		lcm(num1, num2);

	}

	private static void lcm(int num1, int num2) {
		Stack<Integer> stack = new Stack<>();
		int lcm = 1;
		int i = 1;
		int num = num2 > num1 ? num1 : num2;
		while(num>1) {
			if(num1%num == 0 && num2%num == 0) {
				stack.push(num);
				num1 = num1/num;
				num2 = num2/num;
			
				if((num - (i*2)) > 0 ) {
					i = i*2;
					num = num - i;
				}
				else if(num>2) {
					num--;
				}
				
			}
			else if(num1 == 1 || num2 == 1 || num == 1 || num ==2) {
				stack.push(num1);
				stack.push(num2);
				break;
			}
			else if(num > i) {
				i = i*2;
				num = num - i;
			}
			
			else {
				i = 1;
			}
		}
	while(!stack.isEmpty()) {
		lcm = lcm * stack.pop();
	}	
	System.out.print(lcm);
	}

}
