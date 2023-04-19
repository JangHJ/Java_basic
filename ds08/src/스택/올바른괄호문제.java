package 스택;

import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		//String s = "()()";
		String s = ")()((";
		boolean answer = false;
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            //여는 괄호일 때
            if(c == '('){
                stack.push(c);
            }
            //닫는 괄호일 때
            else{
                try {
                	stack.pop();
				} catch (Exception e) {
					System.out.println(answer);
				}
            }
        }
        answer = stack.empty();
        
		System.out.println(answer);
	}

}
