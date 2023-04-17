package 문자열;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		boolean answer = true;
		char[] c = s.toCharArray();
		int size = s.length();
		if(size == 4 || size == 6){
			for(char x : c) {
				if(!Character.isDigit(x)) {
					answer = false;
					break;
				}
			}
			System.out.println(false);
		}else {
			System.out.println(false);
		}
	}
}
