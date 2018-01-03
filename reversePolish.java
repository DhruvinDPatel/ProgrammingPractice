import java.util.Stack;

public class reversePolish{

	public static int evaluate(String[] tokens){
		int finalValue = 0;
		String operators = "/*+-";

		Stack<String> stack = new Stack<String>();

		for(String ch: tokens){

			if(!operators.contains(ch))
				stack.push(ch);
			else{
				int first = Integer.valueOf(stack.pop());
				int second = Integer.valueOf(stack.pop());

				switch(ch){
					case "/":
						stack.push(String.valueOf(second / first));
						break;
					case "*":
						stack.push(String.valueOf(first * second));
						break;
					case "+":
						stack.push(String.valueOf(first + second));
						break;
					case "-":
						stack.push(String.valueOf(second - first));
						break;
				}
			}
		}

		finalValue = Integer.valueOf(stack.pop());
		return finalValue;
	}

	public static void main(String[] args){

		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(evaluate(tokens));
	}
}