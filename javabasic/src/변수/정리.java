package 변수;

public class 정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		double height = 159.8;
		char gender = '여';
		boolean haveDog = true;
		String name = "장희정"; //여러글자 쓸때는 ""
		
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성별 : " + gender);
		System.out.println("강아지를 갖고 있나요? : " + haveDog);
		System.out.println("이름 : " + name);
		
		System.out.println("내 나이는 20대 이상인가요? " + (age >= 20));
		System.out.println("키가 160인가요? " + (height == 160));
		System.out.println("나이가 20대 이상이거나 키가 160이 넘나요? " + (age >= 20 || height >= 160));
	}

}
