package com.DataStructure.Stack.Array;

import java.util.Stack;

class SortStackUsingRecursion{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        Implementation.sortStack(stack);
        
        //working
        
    }
}

class Implementation{

    public static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);

            sorted(stack, temp);

        }
    }

    private static void sorted(Stack<Integer> stack, int temp) {
        if(stack.isEmpty() || temp > stack.peek()){
            stack.push(temp);
            return;
        }
        int value = stack.pop();
        sorted(stack, temp);
        stack.push(value);
    }
}

