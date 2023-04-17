package 문자열;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		int index = 0;
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				index = i;
				break;
			}
		}
		
		answer = "김서방은 " + index + "에 있다";
		System.out.println(answer);
	}

}
