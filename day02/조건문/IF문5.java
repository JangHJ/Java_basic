package 조건문;

public class IF문5 {
	public static void main(String[] args) {
		String ssn = "2233444";
		
		if (ssn.equals(ssn)) {
			System.out.println("동일한 지역입니다.");
		}else {
			System.out.println("동일한 지역이 아닙니다.");
		}
		
		char gender = ssn.charAt(0); //첫번째 자리에 있는 문자 추출
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
		
		if(gender == '1' || gender == '3'){
			System.out.println("남자");
		}else if(gender == '2' || gender == '4'){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
