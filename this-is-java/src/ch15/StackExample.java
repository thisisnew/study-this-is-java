package ch15;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> stack = new Stack<Coin>();
		
		stack.add(new Coin(500));
		stack.add(new Coin(100));
		stack.add(new Coin(50));
		stack.add(new Coin(10));
		
		while(!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println(coin.getValue()); //LIFO
		}
	}
}	
